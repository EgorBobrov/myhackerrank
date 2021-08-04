package puzzles.math;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
// Given an integer n, return a string array answer (1-indexed) where:
/*
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true.
 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        // handle the edge cases
        if (n == 0) return List.of();
        if (n == 1) return List.of("1");

        List<String> result = new ArrayList<>();
        // We need to iterate and check every element for the conditions.
        // In this version of FizzBuzz, we try not to duplicate the checks.
        // It's possible to use less memory if instead of StringBuilder we just used
        // a check for i%3 && i%5, i%3, i%5 and else, adding regular strings at each step.
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            result.add(sb.toString());
        }
        return result;
    }

}
