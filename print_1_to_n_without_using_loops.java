package Problems;

public class print_1_to_n_without_using_loops {
    static int a = 1;

    public static void printNos(int N) {
        // Your code here

        if (a <= N) {
            System.out.print(a + " ");
            a++;
            printNos(N);
        }

    }

    public static void main(String[] args) {
        
        printNos(50);

    }
}