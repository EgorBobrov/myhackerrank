package puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewYearChaosTest {

    @Test
    void testMinimumBribesSolution_when2_1_5_3_4_thenReturn3() {
        int result = NewYearChaos.minimumBribesSolution(new int[]{2, 1, 5, 3, 4});
        assertEquals(3, result);
    }

    @Test
    void testMinimumBribesSolution_when5_1_2_3_7_8_6_4_thenTooChaotic() {
        int result = NewYearChaos.minimumBribesSolution(new int[]{5, 1, 2, 3, 7, 8, 6, 4});
        assertEquals(-1, result);
    }

    @Test
    void testMinimumBribesSolution_when2_5_1_3_4_thenTooChaotic() {
        int result = NewYearChaos.minimumBribesSolution(new int[]{2, 5, 1, 3, 4});
        assertEquals(-1, result);
    }

    @Test
    void testMinimumBribesSolution_when1_2_5_3_7_8_6_4_thenReturn3() {
        int result = NewYearChaos.minimumBribesSolution(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
        assertEquals(7, result);
    }

    @Test
    void testMinimumBribesSolution_when1_2_5_3_4_7_8_6_thenReturn4() {
        int result = NewYearChaos.minimumBribesSolution(new int[]{1, 2, 5, 3, 4, 7, 8, 6});
        assertEquals(4, result);
    }

}