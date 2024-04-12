package s15_queue;
import java.util.*;

public class s10_deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);

        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        System.out.println("first ele "+deque.getFirst());
        System.out.println("last ele "+deque.getLast());

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);
    }
}
