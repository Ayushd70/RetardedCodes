//Java program to create a deadlock by imposing circular wait

public class DeadLock {
    static class ThreadOne implements Runnable {

        public void run() {
            synchronized (Integer.class) {
                System.out.println(Thread.currentThread().getName() + " - Got lock on Integer.class");
                synchronized (String.class) {
                    System.out.println(Thread.currentThread().getName() + " - Got lock on String.class");
                }
            }
        }
    }

    static class ThreadTwo implements Runnable {

        public void run() {
            synchronized (String.class) {
                System.out.println(Thread.currentThread().getName() + " - Got lock on String.class");
                synchronized (Integer.class) {
                    System.out.println(Thread.currentThread().getName() + " - Got lock on Integer.class");
                }
            }
        }

    }

    public static void main(String[] args) {
        new Thread(new ThreadOne(), "ThreadOne").start();
        new Thread(new ThreadTwo(), "ThreadTwo").start();
    }
}