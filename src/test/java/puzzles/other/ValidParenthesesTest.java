package puzzles.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void shouldReturnTrueForPairOfParentheses() {
        assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    void shouldReturnTrueForThreePairsOfParentheses() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void shouldReturnFalseForMismatchedPair() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    void shouldReturnFalseForTwoMismatchedPairs() {
        assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    void shouldReturnTrueForTwoPairsOfParentheses() {
        assertTrue(ValidParentheses.isValid("{[]}"));
    }

    @Test
    void shouldReturnFalseWhenNoOpeningParentheses() {
        assertFalse(ValidParentheses.isValid(")]"));
    }
}