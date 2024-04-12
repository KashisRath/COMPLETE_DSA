package S24_DDynamic_programing;

public class s6_01knapsack_tabulation {
    public static int knapsackTap(int val[],int wt[],int w)
    {
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++)
        {//0th col
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++)
        {//0th row
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                int v=val[i-1];//ith item val;
                int wth=wt[i-1];//ith item wt;
                if(wth<=j)
                {
                   int incProfit=v+dp[i-1][j-wth];
                   int excProfit=dp[i-1][j];
                   dp[i][j]=Math.max(incProfit,excProfit);
                }
                else
                {//invalid
                   int excProfit=dp[i-1][j];
                   dp[i][j]=excProfit;
                }
            }
        }
        print(dp);
        return dp[n][w];
    }

    public static void print(int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print (dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int dp[][]=new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsackTap(val, wt, w));
    }
}
