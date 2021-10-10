public class CircularSinglyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class CircularSingLinkedList {
        private Node head;

        public CircularSingLinkedList() {
            this.head = null;
        }

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
                current.next = newNode;
            }
        }

        public String search(int key) {
            if (head != null) {
                Node current = head;
                while (current.next != head && current.data != key) {
                    current = current.next;
                }
                if (current.next == head && current.data != key) {
                    return "Node [" + key + "] not found";
                } else {
                    return "Node [" + key + "] found";
                }
            }
            return "Node [" + key + "] not found";
        }

        public boolean delete(int index) {
            if (index < 0 || index >= size()) {
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
                    head = head.next;
                }
            } else {
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }

            return true;
        }

        public int size() {
            int count = 0;
            if (head == null) {
                return count;
            } else {
                count++;
                Node current = head;
                while (current.next != head) {
                    count++;
                    current = current.next;
                }
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
        CircularSingLinkedList list = new CircularSingLinkedList();
        list.insert(0, 38);
        list.insert(0, 12);
        list.insert(1, 373);
        list.insert(2, 43);
        list.insert(1, 10);
        list.insert(0, 91);
        list.insert(6, 30);
        list.insert(8, 89);
        list.display();
        System.out.println("==========================");
        System.out.println(list.search(38));
        System.out.println(list.search(373));
        System.out.println(list.search(30));
        System.out.println("==========================");
        System.out.println(list.delete(6));
        list.display();
        System.out.println(list.delete(3));
        list.display();
        System.out.println(list.delete(0));
        list.display();
        System.out.println("==========================");
    }
}
