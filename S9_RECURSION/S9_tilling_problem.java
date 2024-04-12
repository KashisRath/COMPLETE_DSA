package S9_RECURSION;

public class S9_tilling_problem {
    public static int tilling(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        //vertical distance
        int verticaldis=tilling(n-1);

        //horizontal distance
        int horizontaldis=tilling(n-2);

        return verticaldis+horizontaldis;
    }
    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
