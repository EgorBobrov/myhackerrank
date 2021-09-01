package puzzles.trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/786/
// Given the root of a binary tree, return the inorder traversal of its nodes' values.
public class InOrderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        // The basic algorithm for in-order traversal is recursive: visit left tree,
        // visit current node, visit right tree.
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private static void inOrderTraversal(TreeNode root, List<Integer> storage) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, storage);
        storage.add(root.val);
        inOrderTraversal(root.right, storage);
    }
}
