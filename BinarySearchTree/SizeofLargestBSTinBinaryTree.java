package BinarySearchTree;

import static BinarySearchTree.SortedArrayToBalancedBST.preorder;

public class SizeofLargestBSTinBinaryTree {
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min,int max)
        {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;

    public static Info largestBST(BSTBasics.Node root)
    {
        if(root == null) {
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if (leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);
    }
    public static void main(String[] args) {
        /*
                    50
                   /   \
                  30    60
                 /  \  /  \
                5   20 45  70
                          /  \
                         69   80
         */
        BSTBasics.Node root = new BSTBasics.Node(50);
        root.left = new BSTBasics.Node(30);
        root.left.left = new BSTBasics.Node(5);
        root.left.right = new BSTBasics.Node(20);

        root.right = new BSTBasics.Node(60);
        root.right.left = new BSTBasics.Node(45);
        root.right.right = new BSTBasics.Node(70);
        root.right.right.left = new BSTBasics.Node(69);
        root.right.right.right = new BSTBasics.Node(80);

        /*
        Expected
                        60
                       /  \
                      45  70
                         /  \
                        69   80

                        size: 5
         */
        largestBST(root);
        System.out.println("Size of the Largest BST is "+maxBST);
        preorder(root);
    }
}
