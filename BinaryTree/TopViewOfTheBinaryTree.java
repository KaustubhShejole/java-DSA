package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTheBinaryTree {

    static class Info{
        TreeBasic.Node node;
        int hd;

        public Info(TreeBasic.Node node, int hd)
        {
            this.node= node;
            this.hd = hd;
        }
    }
    public static void top_view(TreeBasic.Node root)
    {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, TreeBasic.Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        q.add(new Info(root,0));
        q.add(null);

        while (!q.isEmpty())
        {
            Info currInfo = q.remove();
            if (currInfo == null)
            {
                if (q.isEmpty())
                {
                    break;
                }
                else
                    q.add(null);
            }
            else {
                if (!map.containsKey(currInfo.hd))
                {
                    //System.out.println(currInfo.hd+" "+ currInfo.node.data);
                    map.put(currInfo.hd, currInfo.node);
//                    min = Math.min(currInfo.hd, min);
//                    max = Math.max(currInfo.hd, max);
                }
                if (currInfo.node.left != null)
                {
                    min = Math.min(currInfo.hd-1, min);

                    q.add(new Info(currInfo.node.left, currInfo.hd - 1));
                }
                if (currInfo.node.right != null)
                {
                    max = Math.max(currInfo.hd+1, max);
                    q.add(new Info(currInfo.node.right,currInfo.hd +1));
                }
            }
        }
        for (int i = min; i < max+1 ; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
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

        top_view(root);
    }
}
