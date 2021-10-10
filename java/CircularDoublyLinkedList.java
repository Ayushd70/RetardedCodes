public class CircularDoublyLinkedList {
    public static class Node {
        public int data;
        public Node next;
        public Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public static class CircularDoublyLinkList {

        private Node head;

        public void insert(int index, int data) {
            if (index < 0 || index > size()) {
                return;
            }
            Node newNode = new Node(data);
            if (index == 0) {
                if (head == null) {
                    head = newNode;
                    head.next = head;
                } else {
                    newNode.next = head;
                    head.previous = newNode;
                    Node current = head;
                    while (current.next != head) {
                        current = current.next;
                    }
                    current.next = newNode;
                    head = newNode;
                }
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                newNode.previous = current;
                current.next.previous = newNode;
                current.next = newNode;
            }
        }

        public String search(int key) {
            Node current = head;
            while (current.next != head && current.data != key) {
                current = current.next;
            }
            if (current.next == head && current.data != key) {
                return "Node [" + key + "] not found";
            }
            return "Node [" + key + "] found";
        }

        public boolean delete(int index) {
            if (index < 0 || index > size()) {
                return false;
            }
            if (head == null) {
                return false;
            }
            Node current = head;
            if (index == 0) {
                while (current.next != head) {
                    current = current.next;
                }
                if (current == head) {
                    head = null;
                } else {
                    current.next = head.next;
                    head.next.previous = current;
                    head = head.next;
                }
            } else {
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                Node next = current.next;
                current.next = next.next;
                next.next.previous = current;
            }
            return true;
        }

        public int size() {
            int count = 0;
            if (head == null) {
                return count;
            }
            Node current = head;
            count++;
            while (current.next != head) {
                count++;
                current = current.next;
            }
            return count;
        }

        public void display() {
            if (head != null) {
                Node current = head;
                while (current.next != head) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println(current.data);
            }
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkList list = new CircularDoublyLinkList();
        list.insert(0, 18);
        list.insert(0, 32);
        list.insert(1, 473);
        list.insert(2, 413);
        list.insert(1, 100);
        list.insert(0, 910);
        list.insert(6, 300);
        list.insert(8, 893);
        list.display();
        System.out.println("==========================");
        System.out.println(list.search(18));
        System.out.println(list.search(10));
        System.out.println(list.search(413));
        System.out.println(list.search(910));
        System.out.println(list.search(300));
        System.out.println("==========================");
        System.out.println(list.delete(6));
        list.display();
        System.out.println(list.delete(0));
        list.display();
        System.out.println(list.delete(3));
        list.display();
        System.out.println("==========================");
    }
}
