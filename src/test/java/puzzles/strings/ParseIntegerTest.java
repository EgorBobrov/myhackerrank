package puzzles.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseIntegerTest {

    @Test
    void shouldParse42() {
        assertEquals(42, ParseInteger.myAtoi("42"));
    }

    @Test
    void shouldParse____minus42() {
        assertEquals(-42, ParseInteger.myAtoi("   -42"));
    }

    @Test
    void shouldReturn0ForWhitespace() {
        assertEquals(0, ParseInteger.myAtoi("  "));
    }

    @Test
    void shouldReturn0ForPlusSign() {
        assertEquals(0, ParseInteger.myAtoi("+"));
    }
}