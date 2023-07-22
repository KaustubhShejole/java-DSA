package BinarySearchTree;

public class BSTBasics {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node insert(Node root,int data) {
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (root.data > data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if (root == null)
        {
            return false;
        }
        if (root.data == key)
            return true;
        if (root.data < key)
            return search(root.right,key);
        else
            return search(root.left,key);
    }
    public static Node delete(Node root,int data){
        if (root.data < data){
            root.right = delete(root.right,data);
        } else if (root.data > data) {
            root.left = delete(root.left,data);
        }
        else{
            //voila
            //case1 - leaf node
            if (root.left == null && root.right == null){
                return null;
            }
            //case2- single child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            //case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while (root.left != null)
            root = root.left;
        return root;
    }
    public static void print_in_range(Node root,int k1,int k2){
        if (root == null)
            return;
        if (root.data >= k1 && root.data <= k2){
            print_in_range(root.left,k1,k2);
            System.out.println(root.data+" ");
            print_in_range(root.right,k1,k2);
        }
        else if(root.data < k1)
            print_in_range(root.left,k1,k2);
        else print_in_range(root.right,k1,k2);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root,11)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }

//        root = delete(root,5);
//        System.out.println();
//        inorder(root);
        print_in_range(root,5,11);
    }
}
