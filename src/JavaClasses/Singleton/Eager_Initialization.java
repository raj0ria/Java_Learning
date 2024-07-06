package JavaClasses.Singleton;

public class Eager_Initialization {
    private static Eager_Initialization eagerInitialization = new Eager_Initialization();

    private Eager_Initialization() {

    }

    public static Eager_Initialization getInstance() {
        return eagerInitialization;
    }
}

class Main {
    public static void main(String[] args) {
        Eager_Initialization eagerInitialization1 = Eager_Initialization.getInstance();
        System.out.println(eagerInitialization1.hashCode());

        Eager_Initialization eagerInitialization2 = Eager_Initialization.getInstance();
        System.out.println(eagerInitialization2.hashCode());
    }
}

/**
 * Advantages of Eager Initialized JavaClasses.Singleton in Java:
 *
 1. Simplicity:
    The implementation is straightforward.

 2. Thread-Safety:
    Since the instance is created at the time of class loading, it is inherently thread-safe.

 3. Performance:
    No synchronization overhead is required since the instance is created during class loading. This can result in better performance.

 4. Early Detection of Issues:
    any issues with the creation will be detected at class loading time rather than at runtime when the instance is first accessed.

 * Disadvantages of Eager Initialized JavaClasses.Singleton in Java:
   1. Resource Consumption:
      The instance is created even if it is never used in the application. This can lead to unnecessary resource consumption, which might be critical in resource-constrained environments.

   2. Lack of Flexibility:
      If the singleton instance relies on external resources or configurations that are not available at the time of class loading, it can cause initialization failures.

   3. Inability to Handle Exceptions Gracefully:
      If the instantiation of the singleton instance throws an exception, it can be difficult to handle or recover from it gracefully since the exception will occur at the time of class loading.

 */