package S21_hashmap;
import java.util.*;

public class s8_iteration_on_hashset {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it=cities.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }

        for(String city:cities)
        {
            System.out.println(city);
        }

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);

        TreeSet<String> ths=new TreeSet<>();
        ths.add("Delhi");
        ths.add("Mumbai");
        ths.add("Noida");
        ths.add("Bengaluru");
        System.out.println(ths);
    }
}
