package BinarySearchTree;

import java.util.ArrayList;

import static BinarySearchTree.BSTBasics.insert;
import static BinarySearchTree.BSTBasics.search;

public class RootToLeafPaths {
    public static void print_path(ArrayList<Integer> path)
    {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }
    public static void print_paths_from_root_to_leafs(BSTBasics.Node root, ArrayList<Integer> path){
        /*
        1. Add Node to path.
        2. Left Subtree.
        3. Right Subtree.
         */
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null)
            print_path(path);
        print_paths_from_root_to_leafs(root.left,path);
        print_paths_from_root_to_leafs(root.right,path);
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(BSTBasics.Node root, BSTBasics.Node min, BSTBasics.Node max){
        if (root == null)
            return true;
        if (min != null && root.data <= min.data)
            return false;
        else if (max != null && root.data >= max.data)
            return false;
        return isValidBST(root.left,min,root) &&
                isValidBST(root.right,root,max);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        BSTBasics.Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        print_paths_from_root_to_leafs(root,new ArrayList<>());
        if (isValidBST(root,null,null))
            System.out.println("valid");
        else
            System.out.println("not valid");
    }
}
