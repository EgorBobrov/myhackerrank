package puzzles.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void shouldReturnTrueForSymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(3)));
        assertTrue(SymmetricTree.isSymmetric(root));
    }

    @Test
    void shouldReturnFalseForAsymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)));
        assertFalse(SymmetricTree.isSymmetric(root));
    }

    @Test
    void shouldReturnFalseForImbalancedAsymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null, new TreeNode(3)),
                new TreeNode(2,
                        null, new TreeNode(3)));
        assertFalse(SymmetricTree.isSymmetric(root));
    }

    @Test
    void shouldReturnFalseForImbalancedAsymmetricTree2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null, new TreeNode(2)),
                new TreeNode(2,
                        null, new TreeNode(2)));
        assertFalse(SymmetricTree.isSymmetric(root));
    }

}