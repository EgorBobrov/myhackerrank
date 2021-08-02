package puzzles.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void shouldReturn6() {
        // max subarray is [4,-1,2,1] with sum 6
        int[] input = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaximumSubarray.maxSubArray(input));
    }

    @Test
    void shouldReturn1() {
        // max subarray is [1] with sum 1
        int[] input = new int[] {-2,1};
        assertEquals(1, MaximumSubarray.maxSubArray(input));
    }

    @Test
    void shouldReturn3() {
        // max subarray is [1, 2] with sum 3
        int[] input = new int[] {1,2};
        assertEquals(3, MaximumSubarray.maxSubArray(input));
    }
}