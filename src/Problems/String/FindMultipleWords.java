package Problems.String;

import java.util.*;

public class FindMultipleWords {
    public static void main(String[] args) {

        String str = "Sample string with the the the repeated repeated words words";

        /*
         * First step
         * fetch all the words from the string
         *  i. use spilt method and regex with it, it returns an array of words
         */
        String[] words = str.split("\\s+"); // \\s+ matches multiple white spaces character

        /*
         * i. Find the repeated word (set return 'false' when added non unique element)
         * ii. if false then add that word to a arraylist. so if it comes n times list will have it n-1 times in it.
         */
        Set<String> uniqueWordSet = new HashSet<>();
        List<String> repeatedWords = new ArrayList<>();
        for (String word: words) {
            boolean isRepeated = uniqueWordSet.add(word);
            if (!isRepeated) {
                repeatedWords.add(word);
            }
        }

        //counting how many times that repeated words appeared in the sentence.
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word: repeatedWords) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 2);
            }
        }

        for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() );
        }
    }

}
