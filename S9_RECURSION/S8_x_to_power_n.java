package S9_RECURSION;

public class S8_x_to_power_n {
    public static int power(int n,int k)
    {
        if(k==0)
        {
            return 1;
        }
        return n*power(n, k-1);
    }
    public static void main(String[] args) {
        int k;
        System.out.println(power(2, 5));
    }
}
