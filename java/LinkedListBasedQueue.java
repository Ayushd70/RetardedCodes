public class LinkedListBasedQueue {
    protected static class ListNode {
        public int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    protected int length;
    ListNode front, rear;

    public LinkedListBasedQueue() {
        length = 0;
        front = rear = null;
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty())
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
        length++;
    }

    public void deQueue() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is Empty");
        front = front.next;
        length--;
        if (isEmpty())
            rear = null;

    }

    public int first() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is Empty");
        return front.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = front;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        LinkedListBasedQueue queue = new LinkedListBasedQueue();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(190);
        queue.enQueue(167);
        queue.enQueue(999);
        queue.deQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue);
    }

}
