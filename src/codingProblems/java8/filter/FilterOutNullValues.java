package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterOutNullValues {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null, "David");

        var list = names.stream().filter(Objects::nonNull).toList();

        System.out.println(list);

    }
}
