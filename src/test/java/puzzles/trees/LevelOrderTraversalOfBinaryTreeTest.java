package puzzles.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalOfBinaryTreeTest {

    @Test
    void shouldTraverseBalancedTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
        new TreeNode(3), new TreeNode(4)), new TreeNode(5,
                                            new TreeNode(6), new TreeNode(7)));
        List<List<Integer>> result = LevelOrderTraversalOfBinaryTree.levelOrder(root);
        assertEquals(List.of(List.of(1), List.of(2, 5), List.of(3, 4, 6, 7)), result);
    }

    @Test
    void shouldTraverseSlightlyUnbalancedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),        new TreeNode(20,
                                    new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = LevelOrderTraversalOfBinaryTree.levelOrder(root);
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), result);
    }

    @Test
    void shouldTraverseUnbalancedTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
            new TreeNode(3,
          new TreeNode(4,
        new TreeNode(5), null), null), null), null);
        List<List<Integer>> result = LevelOrderTraversalOfBinaryTree.levelOrder(root);
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4), List.of(5)), result);
    }

}