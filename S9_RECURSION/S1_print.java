package S9_RECURSION;

public class S1_print 
{
    public static void print(int n){
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        print(5);
    }
}
