package puzzles.strings;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
// Given a string s, find the first non-repeating character
// in it and return its index. If it does not exist, return -1.
// s consists of only lowercase English letters.
public class FirstUniqueCharInString {
    public static int firstUniqChar(String s) {
        // cover the edge case right away
        if(s.length() < 2) return 0;

        // O(n^2) solution would be to create a set of Characters,
        // iterate over the string and check if a character is in the set
        // if it is, skip it
        // otherwise, add it to the set and scan the remaining string for duplicates
        // if none found, return the index, otherwise continue

        // O(n) time solution could be to create a Map<Character, Integer>.
        // iterate over the string and check if a character is a key in the map
        // if it is, set the value by the key to -1.
        // otherwise, put the character and its position there.
        // Iterate over a Map to see if it has values > -1
        // then, sort them by size and return the smallest
        // if there are none, return -1

        // A simpler solution could be to utilize the fact that the string is only
        // english lowercase letters by creating an array of length 26 representing chars.
        int[] chars = new int[] {
                -2, -2, -2, -2, -2,
                -2, -2, -2, -2, -2,
                -2, -2, -2, -2, -2,
                -2, -2, -2, -2, -2,
                -2, -2, -2, -2, -2,
                -2
        };
        // each time we see a letter, we look at the value by the index ['a' - s.charAt(i)] in the array.
        // If it's -2, we set it to the current index (i).
        // if it's not (so it's been set before), we set it to -1.
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            switch (chars[index]) {
                case -2:
                    chars[index] = i;
                    break;
                case -1:
                    continue;
                default:
                    chars[index] = -1;
            }
        }
        // Then, we iterate over it and look for the lowest index that's > -2.
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 0) continue;
            if (chars[i] < minValue) minValue = chars[i];
        }
        return minValue == Integer.MAX_VALUE ? -1 : minValue;
    }

}
