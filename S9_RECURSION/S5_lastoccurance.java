package S9_RECURSION;

public class S5_lastoccurance {
    public static int lastoccurance(int arr[],int key,int i){
        if(i==arr.length)
        {
           return -1;
        }

        int found=lastoccurance(arr, key, i+1);
         if(found == -1 && arr[i]==key)
         {
            return i;
         }
         return found;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6,3,4};
        System.out.println(lastoccurance(arr, 3, 0));
    }
}
