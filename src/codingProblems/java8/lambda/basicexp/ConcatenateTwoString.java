package codingProblems.java8.lambda.basicexp;

import java.util.function.BiFunction;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;

        System.out.println(concat.apply("Ashish", " Sharma"));
    }
}
