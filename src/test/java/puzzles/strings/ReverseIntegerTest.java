package puzzles.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void shouldReverseMinus123() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    void shouldReturn0When1534236469() {
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }

}