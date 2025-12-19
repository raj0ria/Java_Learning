package codingProblems.java8.groupby;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharsInAString {
    public static void main(String[] args) {
        String str = "Hello world!";

        var characterStream = str.chars().filter(ch -> ch!=' ').mapToObj(ch -> (char) ch);
        var map = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
