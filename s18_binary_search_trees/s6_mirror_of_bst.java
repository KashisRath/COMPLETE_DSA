package s18_binary_search_trees;

public class s6_mirror_of_bst {
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
   
    public static void inorder(Node root){
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node createMirror(Node root)
    {
        if(root==null)
        {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left=rightMirror;
        root.right=leftMirror;
        return root;
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
        createMirror(root);
        preorder(root);
        
        
    }
}
