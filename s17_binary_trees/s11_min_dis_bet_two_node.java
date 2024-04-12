package s17_binary_trees;

public class s11_min_dis_bet_two_node {
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

    public static Node lca2(Node root,int n1,int n2)
    {
        if(root== null || root.data ==n1 || root.data == n2)
        {
            return root;
        }

        Node leftLca=lca2(root.left, n1, n2);
        Node rightLca=lca2(root.right, n1, n2);

        if(rightLca ==null)
        {
            return leftLca;
        }
        if(leftLca == null)
        {
            return rightLca;
        }
        return root;
    }

    public static int Nodedis(Node root,int n)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data == n)
        {
            return 0;
        }
        int leftDis=Nodedis(root.left, n);
        int rightDis=Nodedis(root.right, n); 
        if(leftDis==-1 && rightDis==-1)
        {
            return -1;
        }
        else if(leftDis == -1)
        {
            return rightDis +1;
        }
        else{
            return leftDis +1;
        }
    }
    public static int mindis(Node root,int n1,int n2){
        Node lca=lca2(root, n1, n2);
        int dis1=Nodedis(root,n1);
        int dis2=Nodedis(root,n2);
        return dis1+dis2;
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

        int n1 = 4, n2 = 6;
        System.out.println("The least common ancestor is " +lca2(root, n1, n2).data);
        System.out.println("the min distance is "+mindis(root, n1, n2));
    }
}

