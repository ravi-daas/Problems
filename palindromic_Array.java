package Problems;
public class palindromic_Array {
    public static int palinArray(int[] arr, int n) {

        boolean ispalindrome = true;

        for (int a = 0; a < arr.length; a++) {
            if (isPalindrome(arr[a])) {
                continue;
            } else {
                ispalindrome = false;
                break;
            }
        }

        if (ispalindrome) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {

        int[] arr = { 232, 131, 552, 44 };

        int result = palinArray(arr, arr.length);

        if (result == 1) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is Not Palindrome");
        }

    }
}
