package puzzles.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InOrderTraversalTest {

    @Test
    void shouldTraverse_21() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertEquals(List.of(2, 1), InOrderTraversal.inorderTraversal(root));
    }

    @Test
    void shouldTraverse_123() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        assertEquals(List.of(1, 2, 3), InOrderTraversal.inorderTraversal(root));
    }



}