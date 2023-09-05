package Problems;

public class count_fully_divider_digits {

    static int evenlyDivides(int N) {
        // code here

        int originalNumber = N;

        int count = 0;

        while (N != 0) {
            int digit = N % 10;

            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }

            N /= 10;
        }

        return count;

    }

    public static void main(String[] args) {

        int N = 22074;

        int count = evenlyDivides(N);

        System.out.println("Count of digits which divides N: " + N + "completely is: " + count);
    }
}
