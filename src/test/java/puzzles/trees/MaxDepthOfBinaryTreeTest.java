package puzzles.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthOfBinaryTreeTest {

    @Test
    void shouldReturn3ForTreeOfDepth3() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                                new TreeNode(15), new TreeNode(7)));
        assertEquals(3, MaxDepthOfBinaryTree.maxDepth(root));
    }

}