package s16_greedy_algorithm;
import java.util.Arrays;

public class s3_min_sum_absoluteDif {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,3,1};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;

        for(int i=0;i<a.length;i++)
        {
            minDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("min absolute diff between the pair = "+minDiff);
    }
}
