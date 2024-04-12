package S21_hashmap;
import java.util.*;

public class s13_subarray_sum_equal_to_k {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k =-10;

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;

        //(sum,count)
        map.put(0,1);
        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
