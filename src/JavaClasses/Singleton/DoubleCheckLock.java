package JavaClasses.Singleton;

public class DoubleCheckLock {
    private static volatile DoubleCheckLock doubleCheckLock;

    private DoubleCheckLock() {}

    public static DoubleCheckLock getInstance() {

        if (doubleCheckLock == null) { //check1

            synchronized (DoubleCheckLock.class) {

                if (doubleCheckLock == null) { //check2
                    doubleCheckLock = new DoubleCheckLock();
                }

            }

        }
        return doubleCheckLock;
    }
}

class Main4{
    public static void main(String[] args) {
        DoubleCheckLock doubleCheckLock1 = DoubleCheckLock.getInstance();
        DoubleCheckLock doubleCheckLock2 = DoubleCheckLock.getInstance();

        System.out.println(doubleCheckLock1.hashCode());
        System.out.println(doubleCheckLock2.hashCode());
    }
}

/**
 * This doublechecklock also has issue which is related to l1 cache
 * Every core/cpu has a cache in b/w with RAM.
 * Thread1 creates an doubleCheckLock object these coputation will happen first in l1 cache before being reflected into the memory. it takes some time before it is available in main memory of jvm
 * Thread2 comes checks with its check whether doubleCheckLock object is null or not and it says i dont know(first time)
 * it then goes to main memory and checks it since thread1 changes havent reflected over here till now it will also see a null value and will create an object
 * assuming cache coherence is not there
 * So in order to prevent above scenarios we uses volatile
 *
 * volatile: every read of a volatile variable will be read from the computer's main memory, and not from the CPU cache,
 *           and similarly, every write to a volatile variable will be written to main memory, and not just to the CPU cache.
 */

/**
 * Disadvantage: Since using volatile it will not use cache : makes it slow
 *               using synchronize: lock/unlock will happen: makes it slow
 */