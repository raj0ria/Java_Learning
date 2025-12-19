package codingProblems.java8.groupby.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCountString {
    public static void main(String[] args) {
        String str = "Hello world!";

        Map<Character, Long> countmap = str.chars().filter(ch -> ch!=' ').mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countmap);
    }
}
