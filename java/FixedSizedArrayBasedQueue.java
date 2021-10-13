public class FixedSizedArrayBasedQueue {
    public static class ArrayBasedQueue {
        protected int[] queueArray;
        protected int size, front, rear;
        private static final int CAPACITY = 16;

        public ArrayBasedQueue() {
            queueArray = new int[CAPACITY];
            size = 0;
            front = 0;
            rear = 0;
        }

        public void enQueue(int data) {
            if (size == CAPACITY) {
                throw new IllegalStateException("Queue is full : Overflow");
            } else {
                size++;
                queueArray[rear] = data;
                rear = (rear + 1) % CAPACITY;
            }
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
    }

    public static void main(String[] args) {
        ArrayBasedQueue queue = new ArrayBasedQueue();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(190);
        queue.deQueue();
        System.out.println(queue);
    }

}
