package codingProblems.java8.lambda.basicexp;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNum {
    public static void main(String[] args) {
        Supplier<Number> ran = () -> new Random().nextGaussian();

        System.out.println(ran.get());
        System.out.println(ran.get());
    }
}
