package puzzles;

import java.util.Arrays;

/*
https://www.hackerrank.com/challenges/greedy-florist/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
A group of friends want to buy a bouquet of flowers.
The florist wants to maximize his number of new customers and the money he makes.
To do this, he decides he'll multiply the price of each flower:
by the number of that customer's previously purchased flowers plus 1.
The first flower will be original price, (0 + 1) * price, the next will be (1 + 1) * price and so on.

Given the size of the group of friends, the number of flowers they want to purchase and the original prices of the flowers:
determine the minimum cost to purchase all of the flowers.


Complete the getMinimumCost function in the editor below. It should return the minimum cost to purchase all of the flowers.
getMinimumCost has the following parameter(s):

c: an array of integers representing the original price of each flower
k: an integer, the number of friends

 */
public class GreedyFlorist {
    /*
    We need to buy ALL flowers, so the minimum possible price (if k >= c.length) is a sum of all elements of c.
    Friends can buy n <= k flowers using their original prices.
    Then, they will be able to buy k < n <= 2*k flowers using prices * 2.
    After that, 2*k < n < 3*k flowers will cost price * 3, and so on.
    We need to start buying from the largest prices, so the lower prices will be multiplied and total sum will be minimal.
    */
    public static int getMinimumCost(int k, int[] c) {
        // c must be sorted from lowest to highest
        Arrays.sort(c);

        int multiplier = 1;
        int result = 0;
        int counter = k;

        for (int i = c.length - 1; i >= 0; i--) {
            if (counter > 0) {
                counter--;
            } else {
                counter = k - 1;
                multiplier++;
            }
            result += (c[i] * multiplier);
        }

        return result;
    }
}
