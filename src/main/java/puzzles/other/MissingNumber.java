package puzzles.other;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
// Given an (unsorted) array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        // So, the brute force solution would be to create a Set of all numbers from 0 to n.
        // Then iterate over the array nums and check if the number is in the set, returning it
        // if it's not there.
        // The complexity would be O(n) space (for storing n elements in the Set) and O(n) time
        // to first put n elements in the set and then to iterate over n elements again.
        // instead of using Set we can initialize an boolean[] and iterating over nums set bools[n]
        // to true, then iterate over bools and return the index by which we have the false value.
        boolean[] isMissing = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            isMissing[nums[i]] = true;
        }
        for (int i = 0; i < isMissing.length; i++) {
            if (!isMissing[i]) {
                return i;
            }
        }

        throw new RuntimeException("No missing value found - check the input.");
    }
}
