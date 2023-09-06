package Problems;

public class armstrong_Number {
    static String armstrongNumber(int n) {

        int original = n;

        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum += digit * digit * digit;

            n /= 10;
        }

        if (original == sum) {
            return "Yes";
        } else {
            return "No";
        }

    }

    public static void main(String[] args) {

        int n = 153;

        String isArmstrong = armstrongNumber(n);

        System.out.println("Is " + n + " a ArmStrong Number: " + isArmstrong);

    }
}
