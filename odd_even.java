package Problems;

public class odd_even {
    static String oddEven(int N) {
        // code here

        if (N % 2 == 0) {

            return "even";

        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {

        String oddEven = oddEven(101);

        System.out.println(oddEven);

    }
}
