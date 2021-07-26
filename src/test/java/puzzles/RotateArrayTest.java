package puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void shouldRotate1_2_3_4_5_6_7ByThree() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        RotateArray.rotate(array, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, array);
    }

    @Test
    void shouldRotate1_1ByThree() {
        int[] array = new int[] {1, 1};
        RotateArray.rotate(array, 3);
        assertArrayEquals(new int[]{1, 1}, array);
    }

    @Test
    void shouldRotate1_2_3ByTen() {
        int[] array = new int[] {1, 2, 3};
        RotateArray.rotate(array, 10);
        assertArrayEquals(new int[]{3, 1, 2}, array);
    }


}