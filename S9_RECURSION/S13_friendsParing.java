package S9_RECURSION;

public class S13_friendsParing {
    public static int friendsParing(int n)
    {
        if(n==1 || n==2 )
        {
            return n;
        }
        //choice
        //single
        int fnm1=friendsParing(n-1);
        int fnm2=friendsParing(n-2);
        int pairways=(n-1)*fnm2;
        return fnm1+pairways;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(friendsParing(n));
    }
}
