package Problems;

public class isPalindrome {

    public static void main(String[] args) {

        int n = 153;

        String isArmstrong = is_palindrome(n);

        System.out.println("Is " + n + " a ArmStrong Number: " + isArmstrong);

    }

    public static String is_palindrome(int n) {
        // Code here

        int originalNumber = n;
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        if (originalNumber == reversedNumber) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
