package codingProblems.java8.lambda.basicexp;

import java.util.function.Function;
import java.util.function.Predicate;

public class IsNumEven {
    public static void main(String[] args) {
        Function<Integer, Boolean> evenUtil = x -> x%2==0 ? Boolean.TRUE : Boolean.FALSE;

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(5));

        System.out.println(evenUtil.apply(5));


    }
}
