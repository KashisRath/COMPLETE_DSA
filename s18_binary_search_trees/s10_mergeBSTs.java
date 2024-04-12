package s18_binary_search_trees;

import java.util.*;

public class s10_mergeBSTs {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        // step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step1
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // step-3
        // merge
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        //sorted Al ->balaced tree
        return createBST(finalArr, 0, finalArr.size()-1);
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {//O(n+m)--->linear time complexity
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root=mergeBSTs(root1, root2);
        preorder(root);
    }
}
