package S12_Arraylist;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class s12_qs_2 {
    public static ArrayList<Integer> findLonly(ArrayList<Integer> nums)
    {
        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.size();

        Collections.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(i!=0 && (nums.get(i-1)==(nums.get(i)-1) || nums.get(i-1)==nums.get(i))){
                continue;
            }

            if(i!=n-1 && (nums.get(i+1)==(nums.get(i)+1) || nums.get(i+1)==nums.get(i))){
                continue;
            }

            result.add(nums.get(i));

        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            int num = input.nextInt();
            arr.add(num);
        }

        System.out.println(findLonly(arr));
    }
}
