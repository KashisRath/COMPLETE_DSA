// Question 1 :
// Generate Binary Numbers
// Given a number N. The task is to generate and print all binary numbers with decimal values from
// 1 to N.
// Sample Input 1 : N =2
// Sample Output 1 : 1 10
// Sample Input 2 : 5.
// Sample Output 2 : 1 10 11 100 101

package s15_queue;
import java.util.*;

public class s13_qs_1 {
    public static void genBinaryNo(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n >= 1) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
            n--;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println(i);
            genBinaryNo(i);
        }
    }
}
