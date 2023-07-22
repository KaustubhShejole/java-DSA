package BinaryTree;
public class MinDistanceBetweenTwoNodes {

    public static int lcaDistance(TreeBasic.Node root,int n)
    {
        if(root == null)
        {
            return -1;
        }
        if (root.data == n)
        {
            return 0;
        }
        int leftDistance = lcaDistance(root.left,n);
        int righttDistance = lcaDistance(root.right,n);

        if (leftDistance==-1 && righttDistance==-1)
        {
            return -1;
        } else if (leftDistance == -1) {
            return  righttDistance+1;
        }else{
            return leftDistance+1;
        }
    }
    public static int minDist(TreeBasic.Node root,int n1,int n2)
    {
        TreeBasic.Node lca = LowestCommonAncestor.lowestCommonAncestor(root,n1,n2);
        int dist1 = lcaDistance(lca,n1);
        int dist2 = lcaDistance(lca,n2);

        return dist1+dist2;
    }
    public static void main(String[] args) {
        // we will use lca technique here
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

        int n1=4,n2=5;
        System.out.println(minDist(root,n1,n2));
    }
}
