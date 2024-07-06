package Multithrading.thread_creation;

import java.util.concurrent.TimeUnit;

public class RunnableThreadLambda {
    public static void main(String[] args) {

        Runnable rt = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print(1);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(rt);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.print(0);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
