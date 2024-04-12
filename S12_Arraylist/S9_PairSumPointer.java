package S12_Arraylist;

import java.util.ArrayList;

public class S9_PairSumPointer {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // Case 1: If the pair's sum matches the target, return true.
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // Case 2: If the sum is less than the target, move the left pointer to the right.
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                // Case 3: If the sum is greater than the target, move the right pointer to the left.
                rp--;
            }
        }
        // If the pointers meet without finding a pair, return false.
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}
