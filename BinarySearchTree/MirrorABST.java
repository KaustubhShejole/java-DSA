package BinarySearchTree;

import static BinarySearchTree.BSTBasics.inorder;
import static BinarySearchTree.BSTBasics.insert;

public class MirrorABST {

    public static BSTBasics.Node mirror_a_bst(BSTBasics.Node root){
        if (root==null){
            return null;
        }
        BSTBasics.Node temp;
        temp = root.right;
        root.right = root.left;
        root.left = temp;

        root.left = mirror_a_bst(root.left);
        root.right = mirror_a_bst(root.right);
        return root;
    }

    public static BSTBasics.Node createMirror(BSTBasics.Node root) {
        if (root == null)
            return null;
        BSTBasics.Node leftMirror = createMirror(root.left);
        BSTBasics.Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11};
        BSTBasics.Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        root = createMirror(root);
        inorder(root);
    }
}
