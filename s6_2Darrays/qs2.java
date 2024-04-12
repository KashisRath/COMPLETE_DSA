package s6_2Darrays;


public class qs2 
{
    public static void secRow(int num[][])
    {
        int sum=0;
        for(int j=0;j<num[0].length;j++)
        {
           sum+=num[1][j];
        }
        System.out.println("sum of second row is :"+sum);
    }
    public static void main(String[] args) {
        int num[][]={{1,4,9},{11,4,3},{2,2,3}};
        secRow(num);
    }
}
