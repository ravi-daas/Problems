package Problems;

public class isPerfect {

    public static void main(String[] args) {

        long n = 153;

        int isPerfect = isPerfectNumber(n);

        System.out.println("Is " + n + " a ArmStrong Number: " + isPerfect);

    }

    static int isPerfectNumber(long N) {
        if (N <= 1) {
            return 0; // 1 is not a perfect number, and negative numbers are not considered perfect.
        }

        long sum = 1; // Start with 1 since 1 is always a divisor of N.
        long sqrtN = (long) Math.sqrt(N); // Calculate the square root of N.

        for (int a = 2; a <= sqrtN; a++) {
            if (N % a == 0) {
                sum += a;
                if (a != N / a) {
                    sum += N / a; // Add the corresponding divisor.
                }
            }
        }

        if (sum == N) {
            return 1;
        } else {
            return 0;
        }

    }

}
