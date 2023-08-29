package Problems;

public class count_of_small_Elements {
    
    public static long countOfElements(long arr[], long n, long x)
    {
        
        long count = 0;
        
        long a;
        
        for(a = 0; a<n; a++){
            if(x >= arr[(int) a]){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        
        long [] arr = {24,57,124,987};

        System.out.println("No. of Small Elements: " + countOfElements(arr, arr.length, 90));

    }
}
