package puzzles.arrays;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays
// and you may return the result in any order.
public class IntersectArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // The brute force algorithm would just go and for each element in one array
        // check if it exists in another array; if it does, replace it with some special value (-1)
        // and add to the new array.
        // This would take O(n * m) time and min(m, n) extra space.
        // If one of the arrays is very small, it's efficient.

        // If the arrays were sorted, the algorithm would require linear time. So if the arrays are of
        // comparable size, it could be a good idea to just sort them and go through them picking the same
        // elements.

        // We can use a Map<Integer, Integer> where we store the values and quantity of all elements in the
        // smaller array. Then go through the second array and:
        //      check if it's there
        //      if it is, decrementing the value or removing the pair if the value is 0
        //      putting the value in the resulting array
        // This would work in linear O(n + m) time and require O(n) extra space where n is the smallest arr.
        int[] minArr = nums1.length < nums2.length ? nums1 : nums2;
        int[] preResult = new int[minArr.length];
        Map<Integer, Integer> elements = new HashMap<>(minArr.length);

        for(int i = 0; i < minArr.length; i++) {
            if(elements.containsKey(minArr[i])) {
                elements.put(minArr[i], elements.get(minArr[i]) + 1);
            } else {
                elements.put(minArr[i], 1);
            }
        }

        int[] bigArr = nums1 == minArr ? nums2 : nums1;
        int preResultIndex = 0;
        for(int i = 0; i < bigArr.length; i++) {
            Integer element = elements.get(bigArr[i]);
            if (element != null) {
                preResult[preResultIndex++] = bigArr[i];
                if (element.equals(Integer.valueOf(1))) {
                    elements.remove(bigArr[i]);
                } else {
                    elements.put(bigArr[i], element - 1);
                }
            }
        }

        int[] result = new int[preResultIndex];
        System.arraycopy(preResult, 0, result, 0, preResultIndex);
        return result;
    }
}
