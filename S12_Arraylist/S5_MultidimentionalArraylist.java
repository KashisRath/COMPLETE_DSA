package S12_Arraylist;

import java.util.ArrayList;

public class S5_MultidimentionalArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist =new ArrayList<>();
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);list2.add(4);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++)
            {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

    }
    
}
