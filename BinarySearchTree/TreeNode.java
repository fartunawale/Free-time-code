package BinarySearchTree;

public class TreeNode {
    // Define a TreeNode class for use in the TreeMap
    // Fields for the key-value pair stored in the node and pointers to left and right children
    int key;
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize a TreeNode with a key and value
    public TreeNode(int key, int val){
        this.key = key;
        this.val = val;
        // Initialize left and right children as null
        this.left = null;
        this.right = null;
    }
}
