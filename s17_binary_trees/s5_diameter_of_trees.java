package s17_binary_trees;

public class s5_diameter_of_trees {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int self = lh + rh + 1;

        return Math.max(self, Math.max(ld, rd));
    }

    //aporach 2
    static class info{
        int diam;
        int ht;
        public info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static info diameter2(Node root){
        if(root == null)
        {
            return new info(0,0);
        }
        info leftInfo = diameter2(root.left);
        info rightInfo=diameter2(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);

        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new info(diam, ht);

    }
    public static void main(String[] args) {
        /*
         *      1
         *   /      \
         *  2        3
         * / \      / \
         * 4  5     6  7
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).ht);
    }
}
