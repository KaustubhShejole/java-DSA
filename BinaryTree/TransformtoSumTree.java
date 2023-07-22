package BinaryTree;

public class TransformtoSumTree {

    public static int transform_to_sum_tree(TreeBasic.Node root)
    {
//        int to_return;
//        if (root == null){
//            return 0;
//        }
//        int left_subtree_sum = transform_to_sum_tree(root.left);
//        int right_subtree_sum = transform_to_sum_tree(root.right);
//        to_return = root.data + left_subtree_sum+right_subtree_sum;
//        root.data = left_subtree_sum+right_subtree_sum;
//        return to_return;

        if (root == null)
        {
            return 0;
        }
        int leftChild = transform_to_sum_tree(root.left);
        int rightChild = transform_to_sum_tree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
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

        transform_to_sum_tree(root);
        TreeBasic.BinaryTree.preorder(root);
    }
}
