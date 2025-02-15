package Problems.String;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Ashish";
        System.out.println(reverseString(name));
    }

    private static String reverseString(String name) {

        int length = name.length();
        String reversed = "";

        for (int i = name.length()-1; i >= 0 ; i--) {
            reversed += name.charAt(i);
        }

        return reversed;
    }
}
