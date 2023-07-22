package BinarySearchTree;

import BinaryTree.TreeBasic;
import com.sun.source.tree.BinaryTree;

public class SortedArrayToBalancedBST {
    public static BSTBasics.Node createBST(int arr[],int st,int end)
    {
        if(st > end)
        {
            return null;
        }
        int mid = (st+end)/2;
        BSTBasics.Node root = new BSTBasics.Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;

    }
    public static void preorder(BSTBasics.Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        BSTBasics.Node root = createBST(arr,0,arr.length-1);
        preorder(root);
    }
}
