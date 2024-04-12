package S21_hashmap;
import java.util.*;

public class s1_hashmap_operations {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US", 50);
        System.out.println(hm);
        System.out.println();

        //get - O(1)
        int population =hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));
        System.out.println();

        //conatins key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("russia"));
        System.out.println();

        //remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println("the size is "+hm.size());

        //is empty
        System.out.println("the hash map is empty "+hm.isEmpty());
        System.out.println();

        //isclear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
