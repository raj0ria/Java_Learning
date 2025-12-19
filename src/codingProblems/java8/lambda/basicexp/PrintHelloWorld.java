package codingProblems.java8.lambda.basicexp;

public class PrintHelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = () -> System.out.println("Hello world!");

        helloWorld.sayHello();
        helloWorld.sayDaddy();
        HelloWorld.sayPushHardDaddy();
    }
}

@FunctionalInterface
interface HelloWorld{
    void sayHello();

    default void sayDaddy() {
        System.out.println("Yes daddy!");
    };

    static void sayPushHardDaddy() {
        System.out.println("Please daddy! punish me!");
    }
}
