package puzzles.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTValidatorTest {

    @Test
    void shouldReturnTrueForValidBST() {
        TreeNode root = new TreeNode(2,
                new TreeNode(1), new TreeNode(3));
        assertTrue(BSTValidator.isValidBST(root));
    }

    @Test
    void shouldReturnFalseIfLeftOrRightSubtreesHaveEqualToRootValue() {
        TreeNode root = new TreeNode(2,
                new TreeNode(2), new TreeNode(2));
        assertFalse(BSTValidator.isValidBST(root));
    }

    @Test
    void shouldReturnFalseIfRightChildIsSmaller() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3), new TreeNode(4,
                        new TreeNode(2), new TreeNode(6)));
        assertFalse(BSTValidator.isValidBST(root));
    }

    @Test
    void shouldReturnFalseIfSmallerElementsThanRootInRightSubtree() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4), new TreeNode(6,
                        new TreeNode(3), new TreeNode(7)));
        assertFalse(BSTValidator.isValidBST(root));
    }

}