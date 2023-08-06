package Problems;

public class sum_of_array_elements {
    public static int sumElement(int arr[], int n) {
        int sum = 0;

        for (int a = 0; a < n; a++) {
            sum += arr[a];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 42, 45, 56, 76 };

        int sum_of_array = sum_of_array_elements.sumElement(arr, arr.length);

        System.out.println("Sum of Array: " + sum_of_array);

    }
}
