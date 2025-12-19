package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;

public class FiltersNumbersGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        var list = numbers.stream().filter(n -> n>30).toList();
        System.out.println(list);
    }
}
