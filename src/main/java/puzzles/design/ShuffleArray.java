package puzzles.design;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleArray {
    private final int[] nums;
    private final Random random;

    public ShuffleArray(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffleResult = new int[nums.length];
        // The shuffling can't use the index or the element value info
        // Ideally, we would want to go through the array once, generating random index
        // for each of the element and putting them by the index. The problem is, how to
        // make sure the random indices won't collide?

        // We generate a lot of random numbers in range 0:nums.length-1
        // and put them in a Set of certain size.
        // Then, we iterate over the Set and put each nums element
        // to the nth position in the shuffleResult.
        // We use LinkedHashSet because it keeps the integers in the order of addition,
        // and not order of size.
        // The solution is pretty bad because it takes O(n) extra space for the indices
        // and the indices generator can potentially take a long time to run if it generates
        // a lot of similar values. However, it's late, I'm tired and I can't think of anything else.
        Set<Integer> newIndices = new LinkedHashSet<>();
        while (newIndices.size() < nums.length) {
            newIndices.add(random.nextInt(nums.length));
        }
        int currPos = 0;
        for (Integer i: newIndices) {
            shuffleResult[currPos++] = nums[i];
        }
        return shuffleResult;
    }

}
