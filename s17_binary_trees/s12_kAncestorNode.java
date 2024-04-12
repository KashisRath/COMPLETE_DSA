package s17_binary_trees;

public class s12_kAncestorNode {
    static class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int kAncestor(Node root,int n,int k)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }

        int leftans=kAncestor(root.left, n, k);
        int rightans=kAncestor(root.right, n, k);

        if(leftans==-1 && rightans==-1)
        {
            return -1;
        }
        int max=Math.max(leftans, rightans);
        if(max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        /*
         *      1
         *   /      \
         *  2        3
         * / \      / \
         * 4  5     6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n=3, k = 1;
        kAncestor(root, n, k);
      
    }
}
