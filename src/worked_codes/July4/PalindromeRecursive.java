package worked_codes.July4;

public class PalindromeRecursive {

    // Recursive method to check for palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: crossed or single character
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call: move inward
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
