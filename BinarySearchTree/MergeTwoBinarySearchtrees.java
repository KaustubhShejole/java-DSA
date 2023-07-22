package BinarySearchTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeTwoBinarySearchtrees {

    public static void getInorder(BSTBasics.Node root, ArrayList<Integer> arr)
    {
        if (root == null)
            return ;
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static BSTBasics.Node createBST(ArrayList<Integer> arr,int st,int end)
    {
        if(st > end)
            return null;
        int mid = (st+end)/2;
        BSTBasics.Node root = new BSTBasics.Node(arr.get(mid));
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static BSTBasics.Node mergeBSTs(BSTBasics.Node root1, BSTBasics.Node root2)
    {
        //linear time
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);
        System.out.println(arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);
        System.out.println(arr2);
        //merge

        int i=0,j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) > arr2.get(j))
            {
                finalArr.add(arr2.get(j));
                j = j+1;
            }
            else{
                finalArr.add(arr1.get(i));
                i = i+1;
            }
        }
        while (j<arr2.size())
        {
            finalArr.add(arr2.get(j));
            j = j+1;
        }
        while(i < arr1.size())
        {
            finalArr.add(arr1.get(i));
            i++;
        }
        System.out.println(finalArr);
        return createBST(finalArr,0,finalArr.size() -1);
    }
    public static void preorder(BSTBasics.Node root)
    {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        BSTBasics.Node root1 = new BSTBasics.Node(2);
        root1.right = new BSTBasics.Node(4);
        root1.left = new BSTBasics.Node(1);

        BSTBasics.Node root2 = new BSTBasics.Node(9);
        root2.right = new BSTBasics.Node(12);
        root2.left = new BSTBasics.Node(3);


        BSTBasics.Node root = mergeBSTs(root1,root2);
        preorder(root);
    }
}