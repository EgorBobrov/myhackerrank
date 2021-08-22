package puzzles.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void shouldReturn1() {
        assertArrayEquals(new int[]{1}, PlusOne.plusOne(new int[]{0}));
    }

    @Test
    void shouldReturn4322() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, PlusOne.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    void shouldReturn1000() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, PlusOne.plusOne(new int[]{9, 9, 9}));
    }
}