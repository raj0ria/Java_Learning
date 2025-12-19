package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;

public class FilterStringsThatStartWithASpecificLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "adam");

        var filteredNames = names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .toList();

        System.out.println("Filtered names: "+filteredNames);
    }
}
