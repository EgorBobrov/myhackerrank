package puzzles.arrays;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        // The most straightforward way is to iterate starting from the least significant digit
        // (the last element of the array). If the digit is < 9, just increment it and return.
        // If the element is 9, turn it to 0 and try to increment the next element.
        // If end of the array is reached, create a new array of digits.size + 1, set its first element to 1
        // and return.
        int index = digits.length - 1;
        while(index >= 0 && digits[index] == 9) {
            digits[index--] = 0;
        }
        if (index < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            digits[index]++;
            return digits;
        }
    }
}
