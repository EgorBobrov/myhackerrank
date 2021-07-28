package puzzles.trees;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
// Given the root of a binary tree, return its maximum depth:
// number of nodes along the longest path from the root node down to the farthest leaf node.
public class MaxDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        // A tree is recursive, so it's natural to use recursion here.
        // If the root is null, its depth is 0.
        // If the root doesn't have any children, its depth is 1.
        // If the root has children, its depth is 1 + the depth of the deepest child tree.
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
