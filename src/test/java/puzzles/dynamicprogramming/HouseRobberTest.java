package puzzles.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void shouldReturn18() {
        int[] nums = new int[]{9, 1, 1, 9};
        assertEquals(18, HouseRobber.rob(nums));
    }

    @Test
    void shouldReturn12() {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, HouseRobber.rob(nums));
    }

    @Test
    void shouldReturn9() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(9, HouseRobber.rob(nums));
    }

    @Test
    void shouldReturn7() {
        int[] nums = new int[]{1, 2, 3, 4, 3};
        assertEquals(7, HouseRobber.rob(nums));
    }
}