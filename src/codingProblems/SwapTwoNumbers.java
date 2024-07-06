package codingProblems;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        swapNumbers(num1, num2);

    }

    /**
     * Swapping two numbers without using third variable
     * @param num1
     * @param num2
     */
    public static void swapNumbers(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
