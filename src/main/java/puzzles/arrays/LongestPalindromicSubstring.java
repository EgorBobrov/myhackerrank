package puzzles.arrays;
// https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/780/
// Given a string s, return the longest palindromic substring in s.
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s.length() < 2) return s;
        boolean areAllTheSame = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                areAllTheSame = false;
                break;
            }
        }
        if (areAllTheSame) return s;

        // The brute force algo would have two nested loops: starting from index i,
        // is substring (i, j) a palindrome? This would take O(n^2) * O(n) = O(n^3) time and no extra space.
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if(j - i > result.length() && isPalindrome(s, i, j)) {
                    result = s.substring(i, j);
                }
            }
        }

        return result;
    }

    private static boolean isPalindrome(String s, int startInclusive, int endExclusive) {
        int count = 0;
        for (int i = startInclusive; i < ((endExclusive - startInclusive) / 2) + startInclusive; i++) {
            if (s.charAt(i) != s.charAt(endExclusive - count++ - 1)) return false;
        }
        return true;
    }
}
