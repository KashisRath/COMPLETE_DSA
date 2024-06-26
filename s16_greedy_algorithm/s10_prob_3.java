// Largest Permutation
// Programming
// Greedy Algorithm
// Easy
// 36.9% Success

// 207

// 19

// Bookmark
// Asked In:
// Problem Description

// Given an integer array A of size N consisting of unique integers from 1 to N. You can swap any two integers atmost B times.

// Return the largest lexicographical value array that can be created by executing atmost B swaps.



// Problem Constraints
// 1 <= N <= 106

// 1 <= B <= 109



// Input Format
// First argument is an integer array A of size N.

// Second argument is an integer B.



// Output Format
// Return an integer array denoting the largest lexicographical value array that can be created by executing atmost B swaps.



// Example Input
// Input 1:

//  A = [1, 2, 3, 4]
//  B = 1
// Input 2:

//  A = [3, 2, 1]
//  B = 2


// Example Output
// Output 1:

//  [4, 2, 3, 1]
// Output 2:

//  [3, 2, 1]


// Example Explanation
// Explanation 1:

//  In one swap we can swap (1, 4) so that the array becomes : [4, 2, 3, 1].
package s16_greedy_algorithm;
import java.util.HashMap;

public class s10_prob_3 {
    public static int[] solve(int[] A, int B) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int j = 0; j < A.length; j++) {
            hmap.put(A[j], j);
        }

        int i = 0;
        while (B != 0 && i < A.length) {
            if (A[i] != A.length - i) {
                int tempIndex = hmap.get(A.length - i);
                int temp = A[i];
                A[i] = A[tempIndex];
                A[tempIndex] = temp;

                hmap.put(A[i], i);
                hmap.put(A[tempIndex], tempIndex);
                B--;
            }
            i++;
        }
        return A;
    }

    public static void main(String[] args) {
        // Example input array
        int[] A = {3, 1, 4, 2, 5};
        int B = 2;

        // Call the solve method
        int[] result = solve(A, B);

        // Print the result
        System.out.println("Result after " + B + " swaps:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
