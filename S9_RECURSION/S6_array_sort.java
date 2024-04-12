package S9_RECURSION;

public class S6_array_sort {
    public static Boolean arraysort(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return arraysort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arraysort(arr, 0));
    }
}
