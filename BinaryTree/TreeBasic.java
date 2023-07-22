package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBasic
{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root){
            if (root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if (root == null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root)
        {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty())
            {
                Node currNode = q.remove();
                if (currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null){
                        q.add(currNode.left);
                    }
                    if (currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static int height_of_the_tree_in_terms_of_node(Node root){
        if(root == null)
        {
            return 0;
        }
        int left_height = height_of_the_tree_in_terms_of_node(root.left);
        int right_height = height_of_the_tree_in_terms_of_node(root.right);

        return Math.max(right_height,left_height)+1;
    }
    public static int count_of_nodes(Node root){
        if(root == null)
        {
            return 0;
        }
        int left_count = count_of_nodes(root.left);
        int right_count = count_of_nodes(root.right);

        return 1 + left_count + right_count;
    }
    public static int sum_of_nodes(Node root){
        if(root == null){
            return 0;
        }
        int left_sum = sum_of_nodes(root.left);
        int right_sum = sum_of_nodes(root.right);
        return left_sum + right_sum + root.data;
    }
    public static int diameter_of_a_tree_approach_one(Node root){//O(n^2)
        if (root == null)
            return 0;
        int left_height = height_of_the_tree_in_terms_of_node(root.left);
        int right_height = height_of_the_tree_in_terms_of_node(root.right);
        int self_diameter = left_height + right_height + 1;
        int left_diameter = diameter_of_a_tree_approach_one(root.left);
        int right_diameter = diameter_of_a_tree_approach_one(root.right);
        return Math.max(self_diameter,Math.max(right_diameter,left_diameter));
    }
    static class Info{
        int diameter;
        int height;

        Info(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameter_of_a_tree_approach_two(Node root){//O(n)
        if (root == null){
            return new Info(0,0);
        }
        Info left_info = diameter_of_a_tree_approach_two(root.left);
        Info right_info = diameter_of_a_tree_approach_two(root.right);

        int diameter =  Math.max(left_info.height+right_info.height+1,Math.max(left_info.diameter,right_info.diameter));
        int height = Math.max(left_info.height,right_info.height) + 1;
        return new Info(diameter,height);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println(height_of_the_tree_in_terms_of_node(root));
        System.out.println(count_of_nodes(root));
        System.out.println(sum_of_nodes(root));
        System.out.println("Diameter of a tree = "+diameter_of_a_tree_approach_one(root));
        System.out.println("Diameter = "+diameter_of_a_tree_approach_two(root).diameter);
    }
}