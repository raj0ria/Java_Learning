package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> integerList1 = numbers.stream()
                .filter(n -> n%2==0)
                .toList();

        List<Integer> integerList2 = numbers.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());

        System.out.println(integerList1);
        System.out.println(integerList2);
    }
}
