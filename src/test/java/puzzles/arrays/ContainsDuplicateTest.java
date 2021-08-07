package puzzles.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void shouldReturnTrueFor1_2_3_1() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[] {1, 2, 3, 1}));
    }

    @Test
    void shouldReturnFalseFor1_2_3_4() {
        assertFalse(ContainsDuplicate.containsDuplicate(new int[] {1, 2, 3, 4}));
    }

    @Test
    void shouldReturnTrueFor1_1_1_3_3_4_3_2_4_2() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
}