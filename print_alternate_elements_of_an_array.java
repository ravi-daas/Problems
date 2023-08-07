package Problems;

public class print_alternate_elements_of_an_array {
    public static void print(int arr[], int n) {
        // your code here

        for (int a = 0; a < n; a++) {
            if (a % 2 == 0) {
                System.out.print(arr[a] + " ");
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = { 32, 243, 5621, 76, 2 };

        print(arr, arr.length);

    }
}