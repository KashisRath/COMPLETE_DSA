package S9_RECURSION;

public class S7_first_occurance {
    public static int firstOccurance(int arr[],int k,int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==k)
        {
            return i;
        }
        return firstOccurance(arr, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,4,7,1,9,2,5,8};
        int k=9;
        System.out.println(firstOccurance(arr, 5, 0));

    }
}