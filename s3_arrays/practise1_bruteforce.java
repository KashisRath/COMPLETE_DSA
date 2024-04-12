package s3_arrays;

public class practise1_bruteforce {
    public static void arrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void sum(int numbers[]) {
        System.out.println("The sum is:");
        int maxSum = Integer.MIN_VALUE; 
        int minSum = Integer.MAX_VALUE; 

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int subarraySum = 0; 
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    subarraySum += numbers[k];
                }
                System.out.print(subarraySum + " ");
                
                // Update maxSum and minSum
                if(maxSum<subarraySum)
                {
                    maxSum=subarraySum;
                }
      
                if(minSum>subarraySum)
                {
                    minSum=subarraySum;
                }
                subarraySum = 0; 
            }
        }

        System.out.println("\nMaximum Sum: " + maxSum);
        System.out.println("Minimum Sum: " + minSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        arrays(number);
        System.out.println();
        sum(number);
    }
}
