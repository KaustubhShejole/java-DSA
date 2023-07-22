package BinarySearchTree;

import java.util.ArrayList;

import static BinarySearchTree.SortedArrayToBalancedBST.preorder;

public class ConvertBSTtoBalancedBST {
    public static void inorder(BSTBasics.Node root, ArrayList<Integer> items_list)
    {
        if (root == null){
            return;
        }
        inorder(root.left,items_list);
        items_list.add(root.data);
        inorder(root.right,items_list);
    }
    public static BSTBasics.Node balanceBST(BSTBasics.Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root,inorder);
        //System.out.println(inorder);
        //sorted inorder to Balanced Binary Search Tree
        root = createBST(inorder,0,inorder.size()-1);
        return root;
    }
    public static BSTBasics.Node createBST(ArrayList<Integer> inorder,int st,int end)
    {
        if (st>end)
            return null;
        int mid = (st+end)/2;
        BSTBasics.Node root = new BSTBasics.Node(inorder.get(mid));
        root.left = createBST(inorder,st,mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }
    public static void main(String[] args) {
        BSTBasics.Node root = new BSTBasics.Node(8);
        root = new BSTBasics.Node(8);
        root.left = new BSTBasics.Node(6);
        root.left.left = new BSTBasics.Node(5);
        root.left.left.left = new BSTBasics.Node(3);

        root.right = new BSTBasics.Node(10);
        root.right.right = new BSTBasics.Node(11);
        root.right.right.right = new BSTBasics.Node(12);

        root = balanceBST(root);
        preorder(root);
    }
}
