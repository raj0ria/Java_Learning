package codingProblems.stringproblems;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfChar {
    public static void main(String[] args) {
        String str = "Hello world!";

        Map<Character, Integer> countmap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!countmap.containsKey(c)) {
                countmap.put(c, 1);
            } else {
               int value = countmap.get(c);
               countmap.put(c, value+1);
            }
        }

        System.out.println(countmap);
    }
}
