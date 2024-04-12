package S24_DDynamic_programing;

import java.util.Arrays;

public class s3_climbing_stairs {
    public static int countWays(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }

    //memoization -0(n) | recursion (2^n) -> n= 10^5
     public static int countWays1(int n,int ways[])
     {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(ways[n]!=-1)
        {
             return ways[n];
        }

        ways[n]=countWays1(n-1,ways)+countWays1(n-2,ways);
        return ways[n];
     }

    public static int countwaysTab(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;

        //tabulation loop
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1]+0;
            }
            else
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {
        int n=4;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n));
        System.out.println(countWays1(n,ways));
        System.out.println(countwaysTab(n));

    }
}
