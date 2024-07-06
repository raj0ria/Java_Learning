package JavaClasses.Singleton;

public class Lazy_Synchronized_Init {
    private static Lazy_Synchronized_Init lazySynchronizedInit;

    private Lazy_Synchronized_Init() {

    }

    public synchronized static Lazy_Synchronized_Init getInstance() {

        if (lazySynchronizedInit == null) {
            lazySynchronizedInit = new Lazy_Synchronized_Init();
        }

        return lazySynchronizedInit;
    }
}

class Main3 {
    public static void main(String[] args) {
        Lazy_Synchronized_Init lazySynchronizedInit1 = Lazy_Synchronized_Init.getInstance();
        Lazy_Synchronized_Init lazySynchronizedInit2 = Lazy_Synchronized_Init.getInstance();
        System.out.println(lazySynchronizedInit1.hashCode());
        System.out.println(lazySynchronizedInit2.hashCode());
    }
}

/**
 * Since it is using sync at method level it will become very slow because every time getInstance() is called thread first need to acquire lock and then release it and it takes time
 */