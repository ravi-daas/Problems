package Problems;
// Position this line where user code will be pasted.

import java.util.*;

public class beautiful_Number {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    int[] digits;

    public static void main(String[] args) {

        int n = 101;

        beautiful_Number bN = new beautiful_Number();

        boolean ans = bN.beautifulNumber(n);
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public boolean beautifulNumber(int n) {

        digits = getDigits(n);

        int sum = 0;

        for (int a = 0; a < digits.length; a++) {
            sum += digits[a] * digits[a];
        }

        if (sum == 1) {
            return true;
        }

        if (arrayList.contains(sum)) {
            return false;
        } else {
            arrayList.add(sum);
            return beautifulNumber(sum);
        }
    }

    public static int[] getDigits(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        return digits;
    }
}
