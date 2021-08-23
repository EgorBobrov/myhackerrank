package puzzles.arrays;

import java.util.*;

public class Sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        // can't have triplets if there are less than 3 elements
        if (nums.length < 3) return Collections.emptyList();

        if (nums.length == 3) return nums[0] + nums[1] + nums[2] == 0 ?
                List.of(List.of(nums[0], nums[1], nums[2])) : Collections.emptyList();

        // The brute force algorithm would have triple-nested cycle:
        // for each i, for each j = i + i, for each k = j + 1 iterate to the end of the array
        // Create a new List and add it to the result if i + k + j = 0.
        // This would take O(n^3) time - polynomial, but not good at all.

        // Let's try to simplify the problem. For example, if we sort the array,
        // we can go through it and for each element i do 2sum problem - select an element j
        // and search in the array for k = -(i + j). Search in a sorted array takes linear time, so
        // the complexity would be: O(n*log(n)) for sorting + O(n*(n*log(n))), or O(n^2*log(n)).
        // It's better than n^3. Can we improve it further? Possibly: using a hash map, but I didn't manage
        // to make it work, so I will implement the solution with sorting.

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int index = Arrays.binarySearch(nums, j + 1, nums.length, -(nums[i] + nums[j]));
                if (index > 0) {
                    List<Integer> triplet = new ArrayList(3);
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[index]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
