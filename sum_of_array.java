package Problems;

public class sum_of_array {
    
    public static long getSum(long a[], long n)
    {   
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            
            sum += a[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        
        long [] a= {432,532,67546,2313};

        System.out.println(getSum(a, a.length));
    }
}