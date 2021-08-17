package puzzles.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void shouldReturn1() {
        assertEquals(1, SingleNumber.singleNumber(new int[] {1, 2, 2}));
    }

    @Test
    void shouldReturn4() {
        assertEquals(4, SingleNumber.singleNumber(new int[] {4, 1, 2, 2, 1}));
    }

    @Test
    void shouldReturn2() {
        assertEquals(2, SingleNumber.singleNumber(new int[] {2}));
    }

}