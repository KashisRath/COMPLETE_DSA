package S24_DDynamic_programing;

public class s23_min_partition {

    public static int minPartition(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        int w=sum/2;

        int dp[][]=new int[n+1][w+1];

        //bottom up
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        int sum1=dp[n][w];
        int sum2=sum-sum1;
        print(dp);
        return Math.abs(sum1-sum2);
    }

    public static void print(int dp[][])
    {
        for(int i=0;i<dp.length;i++) // <-- Corrected the loop condition
        {
            for(int j=0;j<dp[0].length;j++) // <-- Corrected the loop condition
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[]={1,6,11,5};
        System.out.println(minPartition(nums));
    }
}
