package puzzles.trees;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/790/
// Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest element in the tree.
public class KthSmallest {
    public static int kthSmallest(TreeNode root, int k) {
        // Since we have a BST, we can do in-order traversal, putting each element in a list
        // and then take the kth element in a resulting list of values.
        // This approach will take O(n) time and O(n) extra space.
        // It's obvious that we don't need to traverse ALL elements and put them into a list,
        // only k smallest would suffice. We can stop execution when the length of the list
        // is k and return the last element: this would take O(k) time and O(k) extra space.

        List<Integer> valuesInOrder = new ArrayList<>();
        inOrderTraversal(root, valuesInOrder, k);
        return valuesInOrder.get(k - 1);
    }

    private static void inOrderTraversal(TreeNode root, List<Integer> storage, int k) {
        if (root == null || storage.size() >= k) {
            return;
        }
        inOrderTraversal(root.left, storage, k);
        storage.add(root.val);
        inOrderTraversal(root.right, storage, k);
    }
}
