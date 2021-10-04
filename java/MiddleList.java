public class MiddleList {

    static class Node {
        int data;
        Node next;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    static int countOfNodes(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    static Node deleteMid(Node head) {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node copyHead = head;

        int count = countOfNodes(head);

        int mid = count / 2;

        while (mid-- > 1) {
            head = head.next;
        }

        head.next = head.next.next;

        return copyHead;
    }

    static void printList(Node ptr) {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        System.out.println("Given Linked List");
        printList(head);

        head = deleteMid(head);

        System.out.println("Linked List after deletion of middle");
        printList(head);
    }
}