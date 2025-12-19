package codingProblems.stringproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        //String name = "ABCDE";

        //System.out.println("Reversed (Recursive): " + reverseRecursive(name));
//        String reversedName = reverseAString(name);
//
//        System.out.println(name.substring(1));
//
//        System.out.println(reversedName);
//
//        System.out.println(reverseRecursion("AGRA", ""));
//        System.out.println(reverseIterative("ABCDE"));


        char[] chars = {'a','b','c'};

        String string = new String(chars);

        Stream<Character> characterStream = string.chars().mapToObj(c -> (char)c);

        List<Character> collect = characterStream.collect(Collectors.toList());

        System.out.println(collect);

        //System.out.println(string);
    }

    private static String reverseAString(String name) {
        int len = name.length();
        StringBuilder reversed = new StringBuilder();
        for (int i = len-1; i >=0 ; i--) {
            reversed.append(name.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseRecursive(String s) {
        if (s.isEmpty()) return s;

        return reverseRecursive(s.substring(1)) + s.charAt(0);
    }

//    public static String reverseRecursiveCharArr(String s) {
//        char[] chars = s.toCharArray();
//        int left = chars[0];
//        int right = chars.length-1;
//
//        recursiveHelper(chars, left, right);
//
//        return new String(chars);
//    }
//
//    private static void recursiveHelper(char[] chars, int left, int right) {
//        if (left >= right) return;
//
//        //swap
//        char temp = chars[0];
//        chars[left] = chars[right];
//        chars[right] = temp;
//
//        recursiveHelper(chars, left+1, right-1);
//    }

    public static String reverseRecursion(String str, String rev) {
        if (str.isEmpty()) return rev;
        return reverseRecursion(str.substring(0, str.length()-1), (rev + str.charAt(str.length()-1)));
    }

    public static String reverseIterative(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while (left<right) {
            //swap
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static String reverseRecursiveCharArr(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length-1;

        recursionHelper(chars, left, right);

        return new String(chars);
    }

    private static void recursionHelper(char[] chars, int left, int right) {
        if (left>=right) return;

        //swap
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        recursionHelper(chars, left+1, right-1);
    }
}


