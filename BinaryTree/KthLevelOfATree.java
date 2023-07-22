package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfATree {

    public static void kth_level_iterative_way(TreeBasic.Node root,int k)
    {
        if (root == null)
        {
            return;
        }
        Queue<TreeBasic.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        while (!q.isEmpty() && level<k+1)
        {
            TreeBasic.Node curr = q.remove();
            if (curr == null)
            {
                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    level = level+1;
                    q.add(null);
                }
            }else
            {
                if (level == k){
                    System.out.println(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void k_levl_recursive(TreeBasic.Node root,int level,int k)
    {
        if (root == null)
        {
            return;
        }
        if(level == k)
        {
            System.out.println(root.data);
            return;
        }
        k_levl_recursive(root.left,level+1,k);
        k_levl_recursive(root.right,level+1,k);
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

        k_levl_recursive(root,1,2);
    }
}
