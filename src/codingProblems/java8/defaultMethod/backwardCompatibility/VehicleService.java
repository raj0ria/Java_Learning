package codingProblems.java8.defaultMethod.backwardCompatibility;

public class VehicleService {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.stop();
        b.start();
        b.stop();
    }
}

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping....");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}

/**
 * Backward Compatibility
 * Before Java 8, adding a new method to an interface would break all classes implementing that interface.
 * With default methods, new methods can be added without forcing all implementing classes to change.
 */
