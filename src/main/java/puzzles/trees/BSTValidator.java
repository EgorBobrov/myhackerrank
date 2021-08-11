package puzzles.trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
// Given the root of a binary tree, determine if it is a valid binary search tree (BST).
// A BST is valid if:
//      The left subtree of a node contains only nodes with keys less than the node's key.
//      The right subtree of a node contains only nodes with keys greater than the node's key.
//      Both the left and right subtrees must also be binary search trees.
public class BSTValidator {

    public static boolean isValidBST(TreeNode root) {
        // One way of doing that is to perform in-order traversal of a tree.
        // If BST properties are not satisfied, then in-order traversal would break:
        // at some point, the next value will be <= than the previous value.
        List<Integer> valuesInOrder = new ArrayList<>();
        inOrderTraversal(root, valuesInOrder);
        for (int i = 1; i < valuesInOrder.size(); i++) {
            if (valuesInOrder.get(i) <= valuesInOrder.get(i - 1)) return false;
        }
        return true;
    }
    // obviously, this can be optimized, for example, we can try to fail as soon as the next element of the list is
    // smaller or equal to the previous instead of adding all of them and checking later.
    private static void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }



}
