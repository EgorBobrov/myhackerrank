package puzzles.strings;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;
        // The most obvious approach is to sort the strings and compare the results.
        // This would take O(n*log(n)) time as well as O(n) extra space (where n is the length of
        // both strings - it should be equal for s and t).
        // We can also just create a Map<Character, Integer> for the first String and then for the second
        // string check if the character is in there and decrement/remove the pair.
        // This would require O(n) time and O(n) extra space.

        // The above approach would work for any Unicode chars.
        // If the letters are lowercase English letters, we can think of some optimization.
        // They are essentially numbers, but how does it help? Xoring won't help, neither will
        // adding or multiplying... Let's simply go with the universal approach.

        Map<Character, Integer> values = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (values.containsKey(s.charAt(i))) {
                values.put(s.charAt(i), values.get(s.charAt(i)) + 1);
            } else {
                values.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            Integer num = values.get(t.charAt(i));
            if (num == null) {
                return false;
            } else {
                if (values.get(t.charAt(i)) == 1) {
                    values.remove(t.charAt(i));
                } else {
                    values.put(t.charAt(i), num - 1);
                }
            }
        }
        return true;
    }
}
