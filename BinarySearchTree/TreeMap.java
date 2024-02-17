package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class TreeMap {
    // Define a TreeMap class that implements a binary search tree structure

    // Root node of the TreeMap
    private TreeNode root;

    // Constructor to initialize the TreeMap with no nodes
    public TreeMap() {
        root = null; // TreeMap is initially empty
    }

    // Insert a key-value pair into the TreeMap
    public void insert(int key, int val) {
        TreeNode newNode = new TreeNode(key, val); // Create a new node for insertion
        if (root == null) { // If the tree is empty, make newNode the root
            root = newNode;
            return;
        }
        TreeNode current = root; // Start traversal from the root
        while (current != null) {
            if (newNode.key < current.key) { // If newNode's key is less than current's key, go left
                if (current.left == null) { // Insert as left child if spot is empty
                    current.left = newNode;
                    return;
                } else {
                    current = current.left; // Continue traversal on the left subtree
                }
            } else if (newNode.key > current.key) { // If newNode's key is greater, go right
                if (current.right == null) { // Insert as right child if spot is empty
                    current.right = newNode;
                    return;
                } else {
                    current = current.right; // Continue traversal on the right subtree
                }
            } else { // If key already exists, update the value
                current.val = newNode.val;
                return;
            }
        }
        // Note: The return statement at the end of the method is unnecessary and can be removed.
    }

    // Retrieve the value associated with a given key
    public int get(int key) {
        TreeNode current = root; // Start from the root
        while (current != null) {
            if (key < current.key) { // If the key is less, go left
                current = current.left;
            } else if (key > current.key) { // If the key is greater, go right
                current = current.right;
            } else { // Found the key
                return current.val;
            }
        }
        return -1; // Key not found
    }

    // Find the minimum value in the TreeMap
    public int getMin() {
        TreeNode current = findMin(root); // Find the minimum node starting from the root
        return (current != null) ? current.val : -1; // Return its value or -1 if tree is empty
    }

    // Find the maximum value in the TreeMap
    public int getMax() {
        TreeNode current = root; // Start from the root
        while (current != null && current.right != null) { // Go to the rightmost node
            current = current.right;
        }
        return (current != null) ? current.val : -1; // Return its value or -1 if tree is empty
    }

    // Helper method to find the minimum node starting from a given node
    private TreeNode findMin(TreeNode node) {
        while (node != null && node.left != null) { // Go to the leftmost node
            node = node.left;
        }
        return node; // Return the leftmost node
    }

    // Remove a key-value pair from the TreeMap
    public void remove(int key) {
        root = removeHelper(root, key); // Recursively remove the node with the given key
    }

    // Helper method to remove a node with a specific key
    private TreeNode removeHelper(TreeNode current, int key) {
        if (current == null) {
            return null; // Key not found
        }
        if (key < current.key) { // Go left if the key to remove is less
            current.left = removeHelper(current.left, key);
        } else if (key > current.key) { // Go right if the key to remove is greater
            current.right = removeHelper(current.right, key);
        } else { // Found the node to remove
            if (current.right == null) {
                return current.left; // Replace with left subtree if right is null
            } else if (current.left == null) {
                return current.right; // Replace with right subtree if left is null
            } else { // Node has two children
                TreeNode minNode = findMin(current.right); // Find minimum node in right subtree
                // Replace current node with minNode
                current.key = minNode.key;
                current.val = minNode.val;
                // Remove the minNode from the right subtree
                current.right = removeHelper(current.right, minNode.key);
            }
        }
        return current; // Return the updated subtree
    }

    // Retrieve all keys in the TreeMap in in-order traversal
    public List<Integer> getInorderKeys() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result); // Perform in-order traversal and collect keys
        return result;
    }

    // Helper method to perform in-order traversal of the tree
    private void inOrderTraversal(TreeNode node, List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.left, result); // Visit left subtree
            result.add(node.key); // Visit node
            inOrderTraversal(node.right, result); // Visit right subtree
        }
    }
}
