package codingProblems.java8.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        var map = words.stream().collect(Collectors.groupingBy(w -> w.length()));
        System.out.println(map);
    }
}
