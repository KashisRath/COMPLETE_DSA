package s14_STACK;
import java.util.*;

public class s8_next_greater_element 
{
    public static void main(String[] args) {
        
        int arr[]={2,5,3,7,1};
        Stack<Integer> s= new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }

            //2 if else
            if(s.isEmpty())
            {
                nxtGreater[i]=-1;

            }

            else{
                nxtGreater[i]=arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++)
        {
            System.out.print(nxtGreater[i]+" ");
        }
    }

}
