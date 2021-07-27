package puzzles.arrays;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
// Given an array, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        // handle the situation where we don't need to rotate
        if (nums.length < 2 || k % nums.length == 0) {
            return;
        }

        // remove unnecessary loops
        if (k > nums.length) {
            k %= nums.length;
        }

        // The easiest solution would be to create a new array of size k
        int[] buffer = new int[k];
        // copy the last k elements to it
        System.arraycopy(nums, nums.length - k,
                buffer, 0,
                k);
        // move all existing elements with (n < size - k) k positions to the right
        if (nums.length - k >= 0) {
            System.arraycopy(nums, 0,
                    nums, k,
                    nums.length - k);
        }
        // and copy elements from the second array to the first k positions.
        System.arraycopy(buffer, 0,
                nums, 0,
                k);
    }

}
