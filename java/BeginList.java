// Program to delete a new node from the beginning of the singly linked list

public class BeginList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void deleteFromStart() {

        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        BeginList sList = new BeginList();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        System.out.println("Original List: ");
        sList.display();

        while (sList.head != null) {
            sList.deleteFromStart();
            //Printing updated list
            System.out.println("Updated List: ");
            sList.display();
        }
    }
}
