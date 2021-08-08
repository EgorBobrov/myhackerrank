package puzzles.strings;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
// Write a function that reverses a string. The input string is given as an array of characters s.
public class ReverseString {

    public static void reverseString(char[] s) {
        if (s.length < 2) return;

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
