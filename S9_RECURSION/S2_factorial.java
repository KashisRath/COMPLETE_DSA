package S9_RECURSION;

public class S2_factorial {
    public static int factorial(int n)
    {
       if(n==0)
       {
         return 1;
       }
       return n*factorial(n-1);
       
    }
    public static void main(String[] args) {
        int n=5;
        
        System.out.println(factorial(n));
    }
}
