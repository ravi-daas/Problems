package Problems;

import java.util.*;

public class find_the_median {
    public static int find_median(int[] v) {
        Arrays.sort(v);
        int median = 0;
        if (v.length % 2 == 0) {
            int median2 = v.length / 2;
            int median1 = median2 - 1;
            median = (v[median1] + v[median2]) / 2;
            return median;
        } else {
            median = v.length / 2;
            return v[median];
        }
    }

    public static void main(String[] args) {
        int [] v = {23,5412,65,12376,76};
        find_median(v);
    }
}
