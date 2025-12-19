package Multithrading.thread_creation;

import java.util.concurrent.TimeUnit;

public class RunnableThread implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i<=5; i++) {
            System.out.print(1);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        Thread t1 = new Thread(rt);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.print(0);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
