package BinaryTree;

public class KthAncestorOfANode {
    /*
    1. Find the node
    2. if(root.data == node)
            return 0;
     */
    public static int kth_ancestor(TreeBasic.Node root,int n,int k)
    {
        if (root == null){
            return -1;
        }
        if (root.data == n){
            if (k==0){
                System.out.println(root.data);
            }
            return 0;
        }
        int leftDist = kth_ancestor(root.left,n,k);
        int rightDist = kth_ancestor(root.right,n,k);


        if(leftDist == -1 && rightDist == -1)
        {
            return -1;
        }
        int max = Math.max(leftDist,rightDist);
        if (max+1 == k)
        {
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \  / \
                4  5 6   7
         */
        TreeBasic.Node root = new TreeBasic.Node(1);
        root.left = new TreeBasic.Node(2);
        root.right = new TreeBasic.Node(3);
        root.left.left = new TreeBasic.Node(4);
        root.left.right = new TreeBasic.Node(5);
        root.right.left = new TreeBasic.Node(6);
        root.right.right = new TreeBasic.Node(7);

        int n = 4,k =2;
        System.out.println(kth_ancestor(root,n,k));
    }
}
