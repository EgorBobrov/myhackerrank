package puzzles.dynamicprogramming;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
// Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.
// Police will be alerted if two adjacent houses were broken into on the same night
public class HouseRobber {

    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        // Basically, this issue is "select maximum sum of non-adjacent values from an array".
        // To do it, we can apply Tabulation: saving current value and creating new value at each step
        // based on previous value(s).
        int[] tabulation = new int[nums.length];
        // At the first step, we have only the first value.
        tabulation[0] = nums[0];
        // At the next step, we can choose to keep the previous value or discard it and take new one, if it's bigger.
        tabulation[1] = Math.max(nums[0], nums[1]);
        // Then, we iterate over all other elements of the array. At each step, we analyze if we want to add this value
        // to our rolling sum from two steps before or discard it and skip it, keeping our rolling sum from one step before.
        for(int i = 2; i < nums.length ; i++) {
            tabulation[i] = Math.max(nums[i] + tabulation[i - 2], tabulation[i - 1]);
        }
        return tabulation[tabulation.length - 1];

    }

}
