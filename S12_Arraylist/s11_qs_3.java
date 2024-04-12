package S12_Arraylist;
import java.util.*;

public class s11_qs_3 {
    public static int mostFrequency(ArrayList<Integer> nums, int key) {
        int[] count = new int[1001];

        // building our counting array
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) == key) {
                count[nums.get(i)]++;
            }
        }

        // finding index with the greatest entry
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            arr.add(num);
        }

        
        System.out.println(mostFrequency(arr, k));
    }
}
