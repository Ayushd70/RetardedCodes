public class DoublyLinkedList {
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

    public static class DoublyLinkList {
        private Node head;

        public void insert(int index, int data) {
            if (index < 0 || index > size()) {
                return;
            }
            Node newNode = new Node(data);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                newNode.previous = current;
                if (current.next != null) {
                    current.next.previous = newNode;
                }
                current.next = newNode;
            }
        }

        public String search(int data) {
            Node current = head;
            while (current != null && current.data != data) {
                current = current.next;
            }
            if (current != null) {
                return "Node [" + data + "] found";
            }
            return "Node [" + data + "] not found";
        }

        public boolean delete(int index) {
            if (index < 0 || index > size()) {
                return false;
            }
            if (head == null) {
                return false;
            }
            if (index == 0) {
                if (head.next != null) {
                    head.next.previous = null;
                }
                head = head.next;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                Node next = current.next;
                current.next = next.next;
                if (next.next != null) {
                    next.next.previous = current;
                }
            }
            return true;
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList();
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
