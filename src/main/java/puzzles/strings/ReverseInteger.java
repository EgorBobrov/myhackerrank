package puzzles.strings;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1],
// then return 0. Assume the environment does not allow you to store 64-bit integers.
public class ReverseInteger {
    public static int reverse(int x) {
        if (x == 0) return x;
        // One approach would be to turn the int into a String, reverse the string
        // and parse its value.
        // Another approach is to work directly with the integer:
        // Initialize the result with 0.
        // while x != 0, get the least significant digit (by taking % 10) and divide the x by 10.
        // The existing result should be multiplied by 10 and the new digit added to it.
        // If we overshoot the range, we return 0.
        int result = 0;
        try {
            while (x != 0) {
                result = Math.multiplyExact(result, 10);
                result = Math.addExact(result, x % 10);
                x /= 10;
            }
        } catch (ArithmeticException e) {
            return 0;
        }
        return result;
    }
}
