package puzzles.arrays;
/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
You must have the result be placed in the first part of the array nums.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array.
You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveSortedArrayDuplicates {

    public static int removeDuplicates(int[] nums) {
        // handle the edge case right away
        if (nums.length < 2) {
            return nums.length;
        }
        // We have 2 iterators. The first one points to the last element of the no-duplicate array.
        int endOfSortedArr = 0;
        // The second one points to the next element to be inserted into the no-duplicate array.
        int nextElement = 1;

        while (nextElement < nums.length) {
            if (nums[nextElement] > nums[endOfSortedArr]) {
                nextElement++;
                endOfSortedArr++;
            } else {
                while(++nextElement < nums.length) {
                    if (nums[nextElement] > nums[endOfSortedArr]) {
                        nums[++endOfSortedArr] = nums[nextElement];
                    }
                }
            }
        }
        return endOfSortedArr + 1;
    }
}
