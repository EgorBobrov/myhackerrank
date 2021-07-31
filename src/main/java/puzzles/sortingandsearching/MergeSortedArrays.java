package puzzles.sortingandsearching;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/

// Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively,
// merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n,
// where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored.
// nums2 has a length of n.
public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // handle edge cases
        if (n == 0) return;
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }

        // The brute force algorithm would be to simply iterate over both arrays
        // using indices i and j for nums1 and nums2, respectively
        // if nums1[i] > nums2[j] shift all elements of nums1 to the right
        // and insert nums2[j] to to the position i.
        // However, it would have a complexity of O(m * n) since we might need to
        // shift m elements n times.

        // An alternative approach with a complexity of O(m + n) could be:
        // iterate over the first array.
        // if nums1[i] > nums2[0], save nums1[i] in a temp variable,
        // set nums2[0] to the position of i in nums1
        // and place temp variable to its correct position in nums2
        // by shifting smaller elements to the left.
        // When all nums1 elements are visited,
        // copy all elements from nums2 to nums1 starting from i.
        int i = 0;
        while (i < m) {
            if (nums1[i] > nums2[0]) {
                int temp = nums1[i];
                nums1[i] = nums2[0];

                int j = 0;
                while (j < n - 1 && nums2[j] < temp && nums2[j + 1] < temp) {
                    nums2[j] = nums2[j + 1];
                    j++;
                }
                nums2[j] = temp;
            }
            i++;
        }

        System.arraycopy(nums2, 0, nums1, i, n);
    }
}
