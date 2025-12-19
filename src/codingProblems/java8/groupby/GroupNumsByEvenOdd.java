package codingProblems.java8.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupNumsByEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var group = numbers.stream().collect(Collectors.groupingBy(num -> num%2==0 ? "Even" : "Odd"));
        System.out.println(group);
    }
}
