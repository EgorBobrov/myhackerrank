package puzzles.dynamicprogramming;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
// Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        // handle edge cases
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        // The brute force approach would be to just go through every possible subarray
        // and select the one with maximum sum. However, it would take too much time (n^n).

        // Since we only need the sum, and not the whole subarray, some tricks are possible.
        // We may start with 2 variables: maxSum and currentSum.
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // if the number we see is bigger than all previous combined,
            // AND their sum will be less than the number we see,
            // there is no reason to keep the previous ones and we can just start from this one.
            if (currentSum < 0 && nums[i] > currentSum) {
                currentSum = nums[i];
            }
            // else, add the number to current rolling sum
            else {
                currentSum += nums[i];
            }
            // if we found new maximum, set it
            if (currentSum > maxSum) maxSum = currentSum;
        }
        return maxSum;
    }
}
