// Problem Description

// Given a set of N intervals denoted by 2D array A of size N x 2, the task is to find the length of maximal set of mutually disjoint intervals.

// Two intervals [x, y] & [p, q] are said to be disjoint if they do not have any point in common.

// Return a integer denoting the length of maximal set of mutually disjoint intervals.



// Problem Constraints
// 1 <= N <= 105

// 1 <= A[i][0] <= A[i][1] <= 109



// Input Format
// First and only argument is a 2D array A of size N x 2 denoting the N intervals.



// Output Format
// Return a integer denoting the length of maximal set of mutually disjoint intervals.



// Example Input
// Input 1:

//  A = [
//        [1, 4]
//        [2, 3]
//        [4, 6]
//        [8, 9]
//      ]
// Input 2:

//  A = [
//        [1, 9]
//        [2, 3]
//        [5, 7]
//      ]


// Example Output
// Output 1:

//  3
// Output 2:

//  2


// Example Explanation
// Explanation 1:

//  Intervals: [ [1, 4], [2, 3], [4, 6], [8, 9] ]
//  Intervals [2, 3] and [1, 4] overlap.
//  We must include [2, 3] because if [1, 4] is included thenwe cannot include [4, 6].
//  We can include at max three disjoint intervals: [[2, 3], [4, 6], [8, 9]]
// Explanation 2:

//  Intervals: [ [1, 9], [2, 3], [5, 7] ]
//  We can include at max two disjoint intervals: [[2, 3], [5, 7]]


// Show similar questions
// Meeting rooms
// 60 Minutes Medium
// Asked in:
// Turn on the Bulbs
// 30 Minutes Very Easy
// Asked in:
// Magical Pool and Items
// 52 Minutes Easy
// Asked in:
// Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a question? Checkout Sample Codes for more details.
// submission-count
// 17451
// successful submissions.


package s16_greedy_algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class s9_prob_2 {
    public static int disjoint(int[][] arr)
    {
        if(arr.length==0)
        {
            return 0;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
        int l=arr[0][1];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
             if(arr[i][0]>=l)
             {
                l=arr[i][1];
                count++;
             }
             else{
                continue;
             }
        }
        return count;

    }
    public static void main(String[] args) {
        
        int[][] A = {{1, 3}, {2, 4}, {3, 6}, {4, 7}};
        System.out.println("Number of compatible pairs: " + disjoint(A));
    }

}
