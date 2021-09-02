package puzzles.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestTest {

    @Test
    void shouldReturn3_for_123456() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
            new TreeNode(2,
        new TreeNode(1), null), new TreeNode(4))
                                            , new TreeNode(6));
        assertEquals(3, KthSmallest.kthSmallest(root, 3));
    }

}