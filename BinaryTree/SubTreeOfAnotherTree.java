package BinaryTree;
public class SubTreeOfAnotherTree {
    /*
    Given the roots of two binary trees root and subRoot,return true
    if there is a subtree of root with the same structure and node
    values of subRoot and false otherwise.
     */

    public static boolean isIdentical(TreeBasic.Node node,TreeBasic.Node subRoot){
        if (node == null && subRoot == null)
            return true;
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right))
            return false;
        return true;
    }
    public static boolean isSubtree(TreeBasic.Node root, TreeBasic.Node subRoot){
        if(root == null)
        {
            return false;
        }
        if (root.data == subRoot.data){
            if(isIdentical(root,subRoot))
            {
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
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

        /*
                    2
                   / \
                  4   5
         */
        TreeBasic.Node  subRoot = new TreeBasic.Node(2);
        subRoot.left = new TreeBasic.Node(4);
//        subRoot.right = new TreeBasic.Node(5);

        System.out.println(isSubtree(root,subRoot));
    }
}
