package puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSortedArrayDuplicatesTest {

    @Test
    void testRemoveDuplicates_when1_1thenReturn1() {
        int[] input = new int[]{1, 1};
        int result = RemoveSortedArrayDuplicates.removeDuplicates(input);
        assertEquals(1, result);
        assertArrayEquals(new int[]{1, 1}, input);
    }

    @Test
    void testRemoveDuplicates_when1_1_2thenReturn2() {
        int[] input = new int[]{1, 1, 2};
        int result = RemoveSortedArrayDuplicates.removeDuplicates(input);
        assertEquals(2, result);
        assertArrayEquals(new int[]{1, 2, 2}, input);
    }

    @Test
    void testRemoveDuplicates_when1_1_2_2_3_3_4thenReturn4() {
        int[] input = new int[]{1, 1, 2, 2, 3, 3, 4};
        int result = RemoveSortedArrayDuplicates.removeDuplicates(input);
        assertEquals(4, result);
        assertArrayEquals(new int[]{1, 2, 3, 4, 3, 3, 4}, input);
    }
}