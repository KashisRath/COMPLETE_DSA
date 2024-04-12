package S12_Arraylist;

import java.util.ArrayList;
import java.util.*;
public class S3_Addlist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        int idx1=1,idx2=2;
        System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        //sorting of array
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
