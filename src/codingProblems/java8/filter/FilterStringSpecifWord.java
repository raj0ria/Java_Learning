package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringSpecifWord {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "I love Java",
                "Python is great",
                "Java is powerful",
                "C++ is old",
                "JavaScript is different from Java"
        );

        var list = sentences.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
