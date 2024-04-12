package S11_Backtracking;

public class S2_subset {
    public static void subset(String str,String ans,int i){

        //base case
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }

        //yes choice
        subset(str, ans+str.charAt(i), i+1);

        //no choice
        subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subset(str, "", 0);
    }
}
