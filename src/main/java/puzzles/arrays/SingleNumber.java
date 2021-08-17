package puzzles.arrays;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        // The first solution that jumps to my mind is to use a data structure like Map<Integer, Integer>
        // and put (nums[i], null) there if map.containsKey(nums[i]) == false,
        // and put (nums[i], nums[i]) otherwise.
        // Then iterate over the map and look for the K-V pair where the value is null.
        // It will work in a linear time, but will take O(n) extra space.

        // Another brute force approach will be to just go over the array and for each element check if the
        // array has the same number on a different index. That would take O(n^2) time but constant extra space.

        // Finally, we can just sort the array and go through it checking if we have a pair of element or not.
        // This would take O(n*log(n)) time and constant extra space (if we sort in-place, like with quicksort).
        // This seems like the best solution I can think of. But it's not linear time/constant space.

        // There is no way of solving it by using comparison. But we can think of other things, like counting
        // or byte manipulation. Counting (keeping a rolling sum) is not going to help, but byte manipulation
        // just might. We know that xor (^) operation on the same two numbers returns 0 because it returns
        // 1 for each byte that's not the same.
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
