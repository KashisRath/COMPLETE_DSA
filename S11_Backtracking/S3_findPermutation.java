package S11_Backtracking;

public class S3_findPermutation {
    public static void findPermutation(String str,String ans)
    {
        //base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        //recursion -o(n*n!)
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            System.out.println("curr:"+curr);
            String newstr =str.substring(0,i)+str.substring(i+1);
            System.out.println("newstr:"+newstr
            );
            findPermutation(newstr, ans+curr);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, " ");
    }
}
