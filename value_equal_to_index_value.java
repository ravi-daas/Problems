package Problems;
import java.util.ArrayList;

public class value_equal_to_index_value {

    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int a = 0; a < arr.length; a++) {

            if (arr[a] == a + 1) {
                array.add(a + 1);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        value_equal_to_index_value cs = new value_equal_to_index_value();
        int[] arr = { 1, 2, 3, 41, 5 };
        System.out.println(cs.valueEqualToIndex(arr, 5));
    }
}