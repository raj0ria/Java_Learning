package codingProblems.java8.groupby.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddGroup {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        var map = nums.stream().collect(Collectors.groupingBy(n -> n%2==0 ? "Even":"Odd"));
        System.out.println(map);
    }
}
