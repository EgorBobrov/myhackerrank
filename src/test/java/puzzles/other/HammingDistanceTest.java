package puzzles.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {

    @Test
    void shouldReturn2For1And4() {
        assertEquals(2, HammingDistance.hammingDistance(1, 4));
    }

    @Test
    void shouldReturn1For3And1() {
        assertEquals(1, HammingDistance.hammingDistance(3, 1));
    }
}