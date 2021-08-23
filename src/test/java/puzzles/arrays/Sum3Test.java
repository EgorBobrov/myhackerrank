package puzzles.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Sum3Test {

    @Test
    void shouldReturnEmptyListFor1_2_minus2_minus1() {
        int[] input = new int[] {1, 2, -2, -1};
        List<List<Integer>> lists = Sum3.threeSum(input);
        assertEquals(List.of(), lists);
    }

    @Test
    void shouldReturnTwoLists() {
        int[] input = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = Sum3.threeSum(input);
        assertEquals(2, lists.size());
        assertTrue(lists.contains(List.of(-1, -1, 2)));
        assertTrue(lists.contains(List.of(-1, 0, 1)));
    }

}