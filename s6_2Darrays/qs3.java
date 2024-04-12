package s6_2Darrays;

public class qs3 
{
    public static void printTranspose(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{3,4,5},{6,7,8}};
        int row=2,col=3;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i]=arr[i][j];
            }
        }
        printTranspose(transpose);

    }
}
