package codingProblems.java8.StringProb;

public class StringRegexOperations {
    public static void main(String[] args) {
        String originalString = "  Hello   World  Java  ";
        // Remove all whitespace characters
        String noSpacesString = originalString.replaceAll("\\s", "");
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String without spaces: \"" + noSpacesString + "\"");

        // Remove multiple spaces and replace with a single space
        String singleSpaceString = originalString.replaceAll("\\s+", " ");
        System.out.println("String with single spaces: \"" + singleSpaceString + "\"");

        /**
         * replaceAll(String regex, String replacement): This method replaces every substring that matches the given regular expression (regex) with the replacement string.
         * "\\s": This regular expression represents any whitespace character, including spaces, tabs (\t), newlines (\n), carriage returns (\r), form feeds (\f), and vertical tabs (\v).
         * "": An empty string is used as the replacement to effectively remove the matched whitespace characters.
         * "\\s+": The + quantifier after \s means "one or more" occurrences of whitespace characters. Using \\s+ will replace sequences of multiple spaces with a single replacement (e.g., a single space or an empty string).
         */
    }
}
