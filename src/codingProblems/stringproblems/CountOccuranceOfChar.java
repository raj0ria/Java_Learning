package codingProblems.stringproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccuranceOfChar {
    public static void main(String[] args) {
        String str = "Hello world!";

        Map<Character, Integer> countmap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!countmap.containsKey(c)) {
                countmap.put(c, 1);
            } else {
               countmap.put(c, countmap.get(c)+1);
            }
        }

        //System.out.println(countmap);
        System.out.println(mapOfOccurances(str));
    }

    public static int countOccurances(String str, char c) {
        return (int) str.chars().filter(ch -> ch==c).count();
    }

    public static Map<Character, Long> mapOfOccurances(String str) {
        Stream<Character> characterStream = str.chars().filter(ch -> ch!=' ')
                .mapToObj(ch -> (char)ch);

        Map<Character, Long> countMap = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countMap.forEach((character, aLong) -> {
            System.out.println(character + " : " + aLong);
        });
        return countMap;
    }
}
