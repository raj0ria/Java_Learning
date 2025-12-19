package codingProblems.java8.lambda.basicexp;

import java.util.function.Function;

public class FindSquare {
    public static void main(String[] args) {
        Function<Integer, Integer> squareUtil = x -> x*x;

        System.out.printf("square root of 5: " + squareUtil.apply(5));
    }
}
