package puzzles.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void shouldReverseHello() {
        char[] hello = new char[] {'h', 'e', 'l', 'l', 'o'};
        ReverseString.reverseString(hello);
        assertArrayEquals("olleh".toCharArray(), hello);
    }

    @Test
    void shouldReverseHannah() {
        char[] hello = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
        ReverseString.reverseString(hello);
        assertArrayEquals("hannaH".toCharArray(), hello);
    }

}