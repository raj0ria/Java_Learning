package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPrimeNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 11, 13, 15, 17, 19, 20);

        var list = numbers.stream().filter(num -> isPrime(num)).collect(Collectors.toList());
        System.out.println(list);
    }

    public static boolean isPrime(int num) {
        if (num<=1) return false;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }

        return true;
    }
}
