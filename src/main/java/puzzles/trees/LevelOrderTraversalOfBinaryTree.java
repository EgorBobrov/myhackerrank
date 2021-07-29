package puzzles.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
// Given the root of a binary tree, return the
// level order traversal of its nodes' values. (i.e., from left to right, level by level).
// For example:
// Input: root = [3, 9,20, null,null, 15,7]
// Output: [[3],[9,20],[15,7]]
public class LevelOrderTraversalOfBinaryTree {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // handle the edge cases
        if (root == null) return List.of();
        if (root.right == null && root.left == null) return List.of(List.of(root.val));
        // The most obvious way to do it is to use BFS:
        // it visits current level, then the next level and so on.
        // So, we visit the root node and create a list for it.
        // Then, we add its children to a queue.
        // We visit each of them, add their values to another list and their children to a queue.
        // We repeat that until there are no children to be found.
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(root.val));
        Queue<TreeNode> currentLevelNodes = new ArrayDeque<>();
        putNonNullChildren(root, currentLevelNodes);
        while (!currentLevelNodes.isEmpty()) {
            Queue<TreeNode> nextLevelNodes = new ArrayDeque<>();
            List<Integer> currentLevelValues = new ArrayList<>();
            while (!currentLevelNodes.isEmpty()) {
                TreeNode node = currentLevelNodes.poll();
                currentLevelValues.add(node.val);
                putNonNullChildren(node, nextLevelNodes);
            }
            result.add(currentLevelValues);
            currentLevelNodes = nextLevelNodes;
        }
        return result;
    }

    private static void putNonNullChildren(TreeNode node, Queue<TreeNode> queue) {
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
