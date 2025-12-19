package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;

public class FilterNonEmptyString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "", "banana", "cherry", "", "date");

        var list = words.stream().filter(w -> !w.isEmpty()).toList();
        System.out.println(list);

    }
}
