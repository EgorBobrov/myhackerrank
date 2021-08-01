package puzzles.dynamicprogramming;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbStairs {
    public static int climbStairs(int n) {
        // Taking care of the edge cases
        if (n < 4) return n;
        // The idea is: we can arrive at every step of the staircase by either taking 1 step of size 1
        // from the previous step, or taking 1 step of size 2 from the step before that.
        // So, the number of ways we can climb to the step n is the number of ways we can climb
        // to step n - 1 (and make 1 step from that) plus the number of ways we can climb to step
        // n - 2 (and make 1 step from that).
        // Let's use tabulation technique for that:
        int[] results = new int[n];
        results[0] = 1;
        results[1] = 2;
        results[2] = 3;
        for (int i = 3; i < n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n - 1];
    }
}
