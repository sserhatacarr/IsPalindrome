public class Main {

    // Method to check if a string is a palindrome using two-pointer approach
    static boolean isPalindrome(String str) {
        int i = 0;  // Initialize the start pointer
        int j = str.length() - 1;  // Initialize the end pointer

        // Iterate through the string until the two pointers meet
        while (i < j) {
            // If characters at the two pointers are not equal, it's not a palindrome
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Move the pointers towards each other
            i++;
            j--;
        }

        // If the loop completes, the string is a palindrome
        return true;
    }

    // Method to check if a string is a palindrome by reversing the string and comparing
    static boolean isPalindrome2(String str) {
        String reverse = "";  // Initialize an empty string to store the reversed string

        // Iterate through the string in reverse and construct the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (str.equals(reverse)) {
            return true;  // It's a palindrome
        } else {
            return false;  // It's not a palindrome
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("abba"));  // Test the isPalindrome2 method with "abba" string
    }
}
