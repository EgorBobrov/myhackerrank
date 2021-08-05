package puzzles.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void shouldReturn1_whenMissing1FromArrayOfLength1() {
        assertEquals(1, MissingNumber.missingNumber(new int[] {0}));
    }

    @Test
    void shouldReturn2_whenMissing2FromArrayOfLength3() {
        assertEquals(2, MissingNumber.missingNumber(new int[] {3, 0, 1}));
    }

    @Test
    void shouldReturn2_whenMissing2FromArrayOfLength2() {
        assertEquals(2, MissingNumber.missingNumber(new int[] {0, 1}));
    }

    @Test
    void shouldReturn8_whenMissing8FromArrayOfLength9() {
        assertEquals(8, MissingNumber.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}