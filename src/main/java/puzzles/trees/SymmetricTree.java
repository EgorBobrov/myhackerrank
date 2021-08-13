package puzzles.trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
// Given the root of a binary tree, check whether it is a mirror of itself
// (i.e., symmetric around its center).
public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        // This sounds like a problem of performing an in-order traversal of a tree
        // and then checking the resulting sequence for being a palindrome.
        // But not just any palindrome: it has to have odd size, because
        // left and right subtree sizes must be equal, so their sum will be even;
        // and we add 1 (the root), so total sum will be odd.

        // However, this approach is wrong because it doesn't consider the case of asymmetric
        // subtrees (with only one child) that can produce the same in-order values
        // (if left child and a root have the same values as the root and right child).
        // We can't reduce it to values only, we have to consider the tree structure.

        // The solution is to write a recursive function that accepts left and right subtrees:
        // 1. Checks both roots for equality
        // 2. Checks left-left subtree is equal to right-right subtree
        // 3. Checks left-right subtree is equal to right-left subtree
        return areMirrored(root.left, root.right);
    }

    private static boolean areMirrored(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left != null && right == null ||
                left == null && right != null) return false;
        return (left.val == right.val) &&
                areMirrored(left.left, right.right)
                && areMirrored(left.right, right.left);
    }

}
