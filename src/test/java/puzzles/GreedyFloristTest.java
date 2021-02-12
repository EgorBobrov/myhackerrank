package puzzles;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GreedyFloristTest {

    private static String BIG_UNSORTED_ARRAY = "390225 426456 688267 800389 990107 439248 240638 15991 874479 568754 729927 980985 132244 488186 5037 721765 251885 28458 23710 281490 30935 897665 768945 337228 533277 959855 927447 941485 24242 684459 312855 716170 512600 608266 779912 950103 211756 665028 642996 262173 789020 932421 390745 433434 350262 463568 668809 305781 815771 550800";

    @Test
    void testgetMinimumCost_whenNumFriendsEqualsToNumFlowers_thenMinCostIsSumOfArrayElements() {
        int minSum = GreedyFlorist.getMinimumCost(3, new int[]{2, 5, 6});
        assertEquals(13, minSum);
    }

    @Test
    void testgetMinimumCost_when2FriendsAnd2_5_6FlowerCosts_thenMinCostIs15() {
        int minSum = GreedyFlorist.getMinimumCost(2, new int[]{2, 5, 6});
        assertEquals(15, minSum);
    }

    @Test
    void testgetMinimumCost_when3FriendsAnd1_3_5_7_9FlowerCosts_thenMinCostIs29() {
        int minSum = GreedyFlorist.getMinimumCost(3, new int[]{1, 3, 5, 7, 9});
        assertEquals(29, minSum);
    }

    @Test
    void testgetMinimumCost_forBigUnsortedArray() {
        int minSum = GreedyFlorist.getMinimumCost(3, createIntArrayFromSpaceSeparatedString(BIG_UNSORTED_ARRAY));
        assertEquals(163578911, minSum);
    }

    private static int[] createIntArrayFromSpaceSeparatedString(String numbers) {
        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}