package puzzles.strings;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
// Given a string s, determine if it is a palindrome,
// considering only alphanumeric characters and ignoring cases.
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) return true;

        // The obvious way to go would be to use 2 iterators: from the beginning and the end.
        // they converge until their indices are equal or right < left
        // and compare chars under them, returning false if they are unequal.
        // However, there is a problem: since we can only consider AN-chars,
        // we don't know where the "middle" is if whitespace or special chars are present.
        // So, first we need to clean the string up.
        StringBuilder cleanup = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')
                || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                cleanup.append(s.charAt(i));
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                cleanup.append((char) (s.charAt(i) + ('a' - 'A'))); // convert to lowercase
            }
        }
        String alphanumeric = cleanup.toString();
        // then, we go from both ends and compare characters
        int right = 0;
        int left = alphanumeric.length() - 1;
        while (right < left) {
            if (alphanumeric.charAt(right++) != alphanumeric.charAt(left--)) return false;
        }

        return true;
    }

}
