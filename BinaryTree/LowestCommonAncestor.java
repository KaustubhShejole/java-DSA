package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static boolean root_to_path_calculator(TreeBasic.Node root, TreeBasic.Node node, ArrayList<TreeBasic.Node> path)
    {
        if (root == node){
            path.add(root);
            return true;
        }else if (root == null){
            return false;
        }
        path.add(root);
        boolean is_present_in_left_subtree = root_to_path_calculator(root.left,node,path);
        boolean is_present_in_right_subtree = root_to_path_calculator(root.right,node,path);
        if (!(is_present_in_right_subtree || is_present_in_left_subtree)) {
            path.remove(path.size()-1);
            return false;
        }
        return true;
    }
    public static TreeBasic.Node lowestCommonAncestor(TreeBasic.Node root, TreeBasic.Node node1,TreeBasic.Node node2)
    {
        ArrayList<TreeBasic.Node> path1 = new ArrayList<>();
        ArrayList<TreeBasic.Node> path2 = new ArrayList<>();

        root_to_path_calculator(root,node1,path1);
        root_to_path_calculator(root,node2,path2);

        //last common ancestor
        int i = 0;
        for(;i<path1.size()&& i<path2.size();i++)
        {
            if (path1.get(i)  != path2.get(i))
                break;
        }

        //last equal Node
        System.out.println(path1.get(i-1).data);
        return path1.get(i-1);
    }
    public static boolean root_to_path_calculator(TreeBasic.Node root, int n, ArrayList<TreeBasic.Node> path)
    {
        if (root == null)
            return false;
        path.add(root);
        if (root.data == n)
            return true;
        boolean foundLeft = root_to_path_calculator(root.left,n,path);
        boolean foundRight = root_to_path_calculator(root.right,n,path);
        if (!(foundLeft || foundRight)) {
            path.remove(path.size()-1);
            return false;
        }
        return true;
    }
    public static TreeBasic.Node lowestCommonAncestor(TreeBasic.Node root, int n1,int n2)
    {
        ArrayList<TreeBasic.Node> path1 = new ArrayList<>();
        ArrayList<TreeBasic.Node> path2 = new ArrayList<>();

        root_to_path_calculator(root,n1,path1);
        root_to_path_calculator(root,n2,path2);

        //last common ancestor
        int i = 0;
        for(;i<path1.size()&& i<path2.size();i++)
        {
            if (path1.get(i)  != path2.get(i))
                break;
        }

        //last equal Node
        //System.out.println(path1.get(i-1).data);
        return path1.get(i-1);
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

        TreeBasic.Node lca = lowestCommonAncestor(root,root.left.left,root.right.left);
        System.out.println(lca.data);
        TreeBasic.Node lca1 = lowestCommonAncestor(root,4,5);
        System.out.println(lca1.data);
    }
}
