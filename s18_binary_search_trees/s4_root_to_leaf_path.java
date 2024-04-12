package s18_binary_search_trees;
import java.util.*;

public class s4_root_to_leaf_path{
    static class Node{
        int data;
        Node left,right;

        Node(int data)
        {
           this.data=data;
        }
    }

    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data>val)
        {
            //left subtree
            root.left=insert(root.left, val);
        }
        else
        {
            //right subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static void rootleafPath(Node root,ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printRootleafPath(path);
        }
        rootleafPath(root.left, path);
        rootleafPath(root.right, path);
        path.remove(path.size()-1);
    }
    private static void printRootleafPath(ArrayList<Integer> path) {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void inorder(Node root){
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root, values[i]);
        }
        System.out.print("the bst is:- ");
        inorder(root);
        System.out.println();
        ArrayList<Integer> path=new ArrayList<>();
        rootleafPath(root, path);
    }
}
