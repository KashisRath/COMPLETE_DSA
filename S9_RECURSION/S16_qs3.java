package S9_RECURSION;

public class S16_qs3 {
    public static String convertNumberToString(int n)
    {
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n<10)
        {
            return words[n];
        }
        int lastIndex=n%10;
        int remaining=n/10;
        return convertNumberToString(remaining)+" "+ words[lastIndex];
    }
    public static void main(String[] args) {
        int n=2019;
        System.out.println(convertNumberToString(n));
    }
}
