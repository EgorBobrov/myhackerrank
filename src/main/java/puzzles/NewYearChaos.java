package puzzles;

/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
Each person wears a sticker indicating their initial position in the queue from 1 to n.
Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker.
One person can bribe at most two others.

Determine the minimum number of bribes that took place to get to a given queue order.
Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

Complete the function minimumBribes in the editor below.
minimumBribes has the following parameter(s):
int q[n]: the positions of the people after all bribes
 */
public class NewYearChaos {

    // Basically, the problem is: we had a sorted int array with values = i + 1.
    // Elements can swap places with the element closer to the beginning of the array,
    // or be inserted at n - 2 index, with [n - 2] and [n - 1] elements shifted back.
    public static void minimumBribes(int[] q) {
        int result = minimumBribesSolution(q);
        System.out.println(result == -1 ? "Too chaotic" : result);
    }

    public static int minimumBribesSolution(int[] q) {
        int numBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < q.length; i++) {
            if (q[i] == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                expectedThird++;
            } else if (q[i] == expectedSecond) {
                numBribes++;
                expectedSecond = expectedThird;
                expectedThird++;
            } else if (q[i] == expectedThird){
                numBribes += 2;
                expectedThird++;
            } else {
                return -1;
            }
        }
        return numBribes;
    }

}
