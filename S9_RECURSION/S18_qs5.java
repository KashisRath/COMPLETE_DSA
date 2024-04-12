package S9_RECURSION;

public class S18_qs5 {
    // Java program to count substrings
    // with same first and last characters

    // Function to count substrings
    // with same first and
    // last characters
    static int countSubstrs(String str, int i,
            int j, int n) {
        // base cases
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;
        int m=countSubstrs(str, i + 1, j, n - 1);
        System.out.println("countSubstrs(str, i + 1, j, n - 1):\n  i:"+i+"   j:"+j+"   n:"+n+"\n"+"m:"+m);
        int p=countSubstrs(str, i, j - 1, n - 1);
        System.out.println("countSubstrs(str, i, j - 1, n - 1):\n  i:"+i+"   j:"+j+"   n:"+n+"\n"+"p:"+p);
        int o=countSubstrs(str, i + 1, j - 1, n - 2);
        System.out.println("countSubstrs(str, i + 1, j - 1, n - 2):\n  i:"+i+"   j:"+j+"   n:"+n+"\n"+"o:"+o);
        int res = countSubstrs(str, i + 1, j, n - 1) +
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j))
            res++;

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));
    }
}

// This code is contributed by Anant Agarwal.
