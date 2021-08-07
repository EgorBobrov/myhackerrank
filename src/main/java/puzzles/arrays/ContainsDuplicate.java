package puzzles.arrays;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

import java.util.HashSet;
import java.util.Set;

/* Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;

        // The brute force solution would be to: for each element, look at all other elements
        // The runtime would be O(n^2), but no extra space required.
        // The most obvious faster solution would be to create a Set of Integers
        // and add elements there if they are unique, otherwise return true.
        // We can't save some memory by having a boolean[] because the range of nums is too big.
        // The runtime for that would be O(n) and extra space is O(n) also.

        // initializing set with capacity to save on resizing
        Set<Integer> ints = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            // Set::add method returns false if the element is already present
            if (!ints.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
