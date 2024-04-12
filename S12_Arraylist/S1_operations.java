package S12_Arraylist;

import java.util.ArrayList;

public class S1_operations {
    public static void main(String[] args) {
        
        ArrayList<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation
        int element = list.get(2);
        System.out.println(element);

        //del
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(1,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(10));
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));

        list.add(1,6);
        System.out.println(list);

        System.out.println(list.size());
        //print array list
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //reverse the array list
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i) +" ");
        }
        System.out.println();
    }
}


