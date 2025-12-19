package codingProblems.java8.StringProb;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFreqOfEAchWord {
    public static void main(String[] args) {
        String input = "hello world hello java streams world java";

        //Freq of each word (Stream of String then collect)
        Map<String, Long> collect = Arrays.stream(input.split("\\s")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        //Freq of each char
        Stream<Character> characterStream = input.chars().mapToObj(c -> (char) c);
        Map<Character, Long> collect1 = characterStream.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        //Find first non repeating character
        LinkedHashMap<Character, Long> collect2 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        Set<Map.Entry<Character, Long>> entries = collect2.entrySet();
        Character c = entries.stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().orElse(null);

        Character c1 = input.chars().mapToObj(c2 -> (char) c2)
                .collect(Collectors.groupingBy(c3 -> c3, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst().orElse(null);

        long vowels = input.toLowerCase().chars().filter(c4 -> "aeiou".indexOf(c4) >=0).count();

        long consonant = input.toLowerCase().chars().filter(c5 -> "aeiou".indexOf(c5) <0).count();


        Stream<String> stringStream = Arrays.stream(input.split("\\s"));

        //calculate the word freq
        Map<String, Long> freqMap = stringStream.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        //Find the max freq word
        Optional<Map.Entry<String, Long>> max = freqMap.entrySet().stream().max(Map.Entry.comparingByValue());
        Map.Entry<String, Long> maxEntry = freqMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        for(Map.Entry<String, Long> entry: freqMap.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
        }

//        Sting name = "AShish";

//        Stream<Character> characterStream = name.chars



    }
}
