package S9_RECURSION;
public class S12_duplicate 
{
    public static void reomoveDuplicate(String str,int idx,StringBuilder newStr,boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return ;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            //duplicate
            reomoveDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            reomoveDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollegx";
        reomoveDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
