package s20_heaps;
import java.util.*;

public class s1_pq_in_jcf {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
