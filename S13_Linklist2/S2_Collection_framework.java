package S13_Linklist2;

import java.util.LinkedList;

public class S2_Collection_framework {
    public static void main(String[] args) {
        
        //create
        LinkedList<Integer> ll=new LinkedList<>();
        
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
