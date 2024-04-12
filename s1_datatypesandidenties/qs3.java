package s1_datatypesandidenties;

import java.util.*;

public class qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of pen: ");
        int penCost = sc.nextInt();

        System.out.print("Enter the cost of pencil: ");
        int pencilCost = sc.nextInt();

        System.out.print("Enter the cost of eraser: ");
        int eraserCost = sc.nextInt();

        int totalCost = penCost + pencilCost + eraserCost;

        // Add GST (18%)
        float addGst = (int)(totalCost + (totalCost * 0.18));

        System.out.println("Total cost with GST: " + addGst);
    }
}

