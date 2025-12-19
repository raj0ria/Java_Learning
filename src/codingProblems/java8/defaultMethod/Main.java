package codingProblems.java8.defaultMethod;

interface A {
    default void show() {
        System.out.println("Interface A implementation!");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B implementation");
    }
}

class C implements A, B {

    @Override
    public void show() {
        System.out.println("Custom implementation in class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

/**
 * Multiple Inheritance of Behavior (Solving the Diamond Problem)
 * Java doesn’t support multiple inheritance in classes to avoid ambiguity.
 * However, with default methods, an interface can provide common behavior
 * while still allowing different implementations.
 */
