package codingProblems;

public class CalculateHCF {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;

        // if num1 is smaller than num2 then swap them for finding hcf
        if (num1 < num2) SwapTwoNumbers.swapNumbers(num1, num2);


        System.out.println(findHCF(num1, num2));
        System.out.println(findHCFR(15, 10));
    }

    /**
     *
     * @param num1 Bigger of the two numbers
     * @param num2 Smaller of the two numbers
     * @return HCF of the two numbers.
     * Implements the Euclidean algorithm iteratively.
     * HCF of two numbers without using recursion.
     */
    public static int findHCF(int num1, int num2) {

        while (num2!=0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    /**
     *
     * @param num1 Bigger of two numbers
     * @param num2 Smaller of two numbers
     * @return HCF of the two numbers
     */
    public static int findHCFR(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findHCFR(num2, num1 % num2);
    }
}
