package s1_datatypesandidenties;

import java.util.*;

public class qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Cast one of the operands to double for a floating-point average
        double average = (double)(a + b + c) / 3.0;
        
        System.out.println(average);
    }
}
