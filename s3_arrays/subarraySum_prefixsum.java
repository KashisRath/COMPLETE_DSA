package s3_arrays;
public class subarraySum_prefixsum {
    public static void sum(int numbers[]) {
        System.out.println("The sum is:");
        int maxSum = Integer.MIN_VALUE; 
        int minSum = Integer.MAX_VALUE; 
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currsum= start==0? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<currsum)
                {
                    maxSum=currsum;
                }
                if(minSum>currsum)
                {
                    minSum=currsum;
                }               
            }
        }
        System.out.println("\nMaximum Sum: " + maxSum);
        System.out.println("Minimum Sum: " + minSum);
    }
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        
        System.out.println();
        sum(number);
    }
}
