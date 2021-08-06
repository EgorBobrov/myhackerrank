package puzzles.arrays;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
// Given an array prices where prices[i] is the price of a given stock on the ith day:
// Find the maximum profit you can achieve.
// You may buy and sell the stock multiple times, but you must sell the stock before you buy again.
// Example 1: [7,1,5,3,6,4] -> 7 (buy on day 2 when price is 1, sell on day 3; buy on day 4, sell on 5)
// Example 2: [1,2,3,4,5] -> 4 (buy on day 1, sell on day 5, profit = 5 - 1)
// Example 3: [7,6,4,3,1] -> 0 (no buying and selling, no profit possible)
public class BuySellStocks {

    public static int maxProfit(int[] prices) {
        // handle edge cases
        if (prices.length < 2) return 0;
        if (prices.length == 2) return prices[0] >= prices[1] ? 0 : prices[1] - prices[0];
        int profit = 0;
        /* OK, let's try to think about the obvious algorithm for this.
           We select the "low point" (the first element) and initialize the "high point" with -1.
           We look at the next elements. If high point isn't set (== -1):
           1) If we meet an element < low point, it's the new low point.
           2) If we meet an element > low point, we set new "high point".
           If high point is set (!= -1):
           If an element is bigger than high point, we update it to the value of current element.
           Else, we report profit (by subtracting the current low point from high point),
           set the new low point to current element and the high point to -1, and continue.

           When the array is finished, we check the price points and if high > low, add the difference
           to profits.
           The time complexity of the whole thing is O(n) and space complexity is O(1).
         */
        int lowPoint = prices[0];
        int highPoint = -1;

        for (int i = 1; i < prices.length; i++) {
            if (highPoint == -1) {
                if (prices[i] < lowPoint) {
                    lowPoint = prices[i];
                } else {
                    highPoint = prices[i];
                }
            } else {
                if (highPoint < prices[i]) {
                    highPoint = prices[i];
                } else {
                    profit += (highPoint - lowPoint);
                    highPoint = -1;
                    lowPoint = prices[i];
                }
            }
        }

        if (highPoint > lowPoint) {
            profit += (highPoint - lowPoint);
        }

        return profit;
    }
}
