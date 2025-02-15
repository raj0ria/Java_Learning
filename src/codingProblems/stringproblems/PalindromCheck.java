package codingProblems.stringproblems;

public class PalindromCheck {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrom(str));
        System.out.println(isPalindromRecursiive(str));
        System.out.println(isPlaindrom(str));
    }

    public static boolean isPalindrom(String str) {

        char[] chars = str.toCharArray();
        int left = 0, right = chars.length-1;

        while (left<right) {
            char leftChar = chars[left];
            char rightChar = chars[right];

            if (leftChar!=rightChar) return false;

            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromRecursiive(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length-1;

        return recursivehelper(chars, left, right);
    }

    private static boolean recursivehelper(char[] chars, int left, int right) {
        if (left>=right) return true;

        char leftChar = chars[left];
        char rightChar = chars[right];

        if (leftChar!=rightChar) return false;

        return recursivehelper(chars, left+1, right-1);
    }

    public static boolean isPlaindrom(String str) {
        StringBuilder filtered = new StringBuilder();

        for (char c: str.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        return filtered.toString().contentEquals(filtered.reverse());
    }
}
