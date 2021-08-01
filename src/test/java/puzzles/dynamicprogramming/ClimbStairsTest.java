package puzzles.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {

    @Test
    void shouldReturn2When2Stairs() {
        assertEquals(2, ClimbStairs.climbStairs(2));
    }

    @Test
    void shouldReturn5When4Stairs() {
        assertEquals(5, ClimbStairs.climbStairs(4));
    }

    @Test
    void shouldReturn8When5Stairs() {
        assertEquals(8, ClimbStairs.climbStairs(5));
    }
}