package multithreading;

public class EvenODd {
    private final static Object lock = new Object();
    private static int num = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (num<100) {
                synchronized(lock) {
                    while (num%2!=0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    System.out.println("Even thread: " + num);
                    num++;
                    lock.notifyAll();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (num<100) {
                synchronized(lock) {
                    while (num%2==0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.println("Odd Thread: " + num);
                    num++;
                    lock.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
