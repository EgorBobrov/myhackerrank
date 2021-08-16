package puzzles.other;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
// The Hamming distance between two integers is the number of positions
// at which the corresponding bits are different.
// Given two integers x and y, return the Hamming distance between them.
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        // The simplest approach would be to compare the result of % 2 of both numbers (the last bit)
        // and shift the numbers one bit to the right, removing rightmost bit
        // until they are both 0.
        // The number of times the result of % 2 is not equal is the Hamming Distance.
        // This would potentially take 2 * (31) * 2 operations (% + right shift * 31 times if one of the
        // values is Integer.MAX_VALUE, for each of two integers).

        // Could it be possible to halve the number of operations by using bit manipulation to find a
        // number that has 1s only where the bits are different? Yes: we can use ^ operator.
        int diffBits = x ^ y;
        int distance = 0;
        while (diffBits != 0) {
            distance += diffBits % 2;
            diffBits >>= 1;
        }
        return distance;
    }
}
