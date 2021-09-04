package puzzles.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
// https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/793/
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations
// that the number could represent.
public class LetterCombinations {

    private static Map<Character, List<String>> map = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z"));

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        // Each digit can represent 3-4 letters. We need to compose words
        // by iterating over each possible combination. It would be a very easy
        // nested cycle if we knew how many letters we are going to have.

        if (digits.length() == 1) {
            return map.get(digits.charAt(0));
        }

        List<String> result = new ArrayList<>();
        // We can apply a recursive backtracking algorithm that would build all possible combinations
        // and put them in the list. The exit condition of the recursion is when we have long enough string.
        // Until then, we append new letter to the string builder and try to append the next letter.
        // Then, remove the last appended letter to allow for backtracking.
        backtrack(0, digits, new StringBuilder(), result);

        return result;
    }

    private static void backtrack(int position, String digits,
                                  StringBuilder sb, List<String> result) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < map.get(digits.charAt(position)).size(); i ++) {
            sb.append(map.get(digits.charAt(position)).get(i));
            backtrack(position + 1, digits, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
