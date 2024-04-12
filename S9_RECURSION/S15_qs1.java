package S9_RECURSION;

public class S15_qs1 {
    //using loop

    // public static void findIndex(int arr[],int key)
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]==key)
    //         {
    //             System.out.print(i+" ");
    //         }
    //     }
       
    // }

    //using recursion

    public static void findIndex(int arr[],int key,int i)
    {
      
        //base case
        if(i>arr.length-1)
        {
            return ;
        }

       
            if(arr[i]==key)
            {
                System.out.println(i+" ");
                
            }
            findIndex(arr, key, i+1);
          
       
    }
   
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        // findIndex(arr, key);->>using loop
        findIndex(arr, key, 0);
        System.out.println();
    }
}
