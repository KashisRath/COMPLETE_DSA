package S24_DDynamic_programing;

public class s2_fibTabulation {
    public static int fibTabulation(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int f[]=new int[n+1];//0,0,0,0
        System.out.println(fibTabulation(n));
    }
}
