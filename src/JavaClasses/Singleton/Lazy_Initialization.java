package JavaClasses.Singleton;

public class Lazy_Initialization {
    private static Lazy_Initialization lazyInitialization;

    private Lazy_Initialization() {

    }

    public static Lazy_Initialization getInstance() {

        if (lazyInitialization == null) {
            lazyInitialization = new Lazy_Initialization();
        }

        return lazyInitialization;
    }
}

class Main2 {
    public static void main(String[] args) {
        Lazy_Initialization lazyInitialization1 = Lazy_Initialization.getInstance();
        System.out.println(lazyInitialization1.hashCode());

        Lazy_Initialization lazyInitialization2 = Lazy_Initialization.getInstance();
        System.out.println(lazyInitialization2.hashCode());
    }
}

/**
 * Advantage:
   1. Resource Efficiency: Instance will be created only when it is needed so no wastage of resources when it is not required like in case of eager initialization.

   Disadvantage:
   1. No Thread safety: What if two thread at the same time executes the getinstance method and create two different-2 object
   2. Low speed: Since object is created at the run time it will take more time than eager initialization.
 */
