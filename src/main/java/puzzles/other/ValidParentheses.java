package puzzles.other;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/721/
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
// An input string is valid if:
//      Open brackets are closed by the same type of brackets.
//      Open brackets are closed in the correct order.
public class ValidParentheses {
    public static boolean isValid(String s) {
        // if string length is odd, then the string can't be valid
        if (! (s.length() % 2 == 0)) return false;
        // One solution could be to use a Stack: iterate over the String and every time you see
        // an opening parentheses, push the corresponding closing parentheses to the Stack.
        // If you see a closing one, pop an element from the stack and compare - if they aren't
        // equal, the String is invalid.
        // If the string is over but the stack is not empty, String is invalid as well.
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of('(', ')',
                                                 '{', '}',
                                                 '[', ']');
        for (int i = 0; i < s.length(); i++) {
            if (pairs.containsKey(s.charAt(i))) {
                stack.push(pairs.get(s.charAt(i)));
            } else {
                if (stack.isEmpty() ||
                        !stack.pop().equals(s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
