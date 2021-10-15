public class DynamicArrayBasedQueue {
    protected int[] queueArray;
    protected int size, front, rear;
    private int CAPACITY = 6;

    public DynamicArrayBasedQueue() {
        queueArray = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enQueue(int data) {
        if (size == CAPACITY)
            expand();
        size++;
        queueArray[rear] = data;
        if (size == CAPACITY)
            rear = rear + 1;
        else
            rear = (rear + 1) % CAPACITY;
    }

    public void deQueue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty : Underflow");
        } else {
            size--;
            queueArray[front] = Integer.MIN_VALUE;
            front = (front + 1) % CAPACITY;
        }
    }

    public void expand() {
        int length = size();
        int rear = length - 1;
        int[] newQueueArray = new int[length << 1];
        for (int i = front; i <= rear; i++) {
            newQueueArray[i - front] = queueArray[i % CAPACITY];
        }
        queueArray = newQueueArray;
        front = 0;
        CAPACITY *= 2;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(queueArray[(front + i) % CAPACITY]);
            if (i < size - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        DynamicArrayBasedQueue queue = new DynamicArrayBasedQueue();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(190);
        queue.enQueue(167);
        System.out.println(queue.CAPACITY);
        queue.enQueue(999);
        System.out.println(queue);
        queue.deQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.CAPACITY);
        System.out.println(queue);
    }
}
