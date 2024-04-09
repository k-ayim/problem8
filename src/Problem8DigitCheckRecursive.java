import java.util.Scanner;

public class Problem8DigitCheckRecursive {

    /**
     * Checks whether a string consists only of digits using recursion.
     * 
     * @param s The input string
     * @param index The current index being checked
     * @return true if the string consists only of digits, false otherwise
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true; // Base case: reached the end of the string
        } else if (Character.isDigit(s.charAt(index))) {
            return isAllDigits(s, index + 1); // Check the next character
        } else {
            return false; // Non-digit character found
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isAllDigits(input, 0);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}



