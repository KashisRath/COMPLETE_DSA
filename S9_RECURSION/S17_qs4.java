package S9_RECURSION;

public class S17_qs4 {
    public static int findLength(String n)
    {
        if(n.length() == 0)
        {
            return 0;
        }

        return findLength(n.substring(1))+1;
    }

    
    public static void main(String[] args) {
        String n="kashis";
        System.out.println(findLength(n));
    }
}
