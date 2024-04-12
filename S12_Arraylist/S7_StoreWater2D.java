package S12_Arraylist;

import java.util.ArrayList;

public class S7_StoreWater2D {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp)
        {
           //cal water area
                    int minHeight = Math.min(height.get(lp), height.get(rp));
                    int width = rp - lp;
                    int currentWater = minHeight * width;
                    maxWater = Math.max(maxWater, currentWater);
                
            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }

        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
