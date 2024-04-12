package s4_array2;

public class qs1 {
    public static boolean containsDuplicate(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 1, 4, 5 };
        boolean result = containsDuplicate(num);
        System.out.println("Contains Duplicate: " + result);
    }
}


