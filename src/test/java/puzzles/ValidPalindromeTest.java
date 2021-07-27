package puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void shouldReturnTrueFor_amanaplanacanalpanama() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void shouldReturnFalseFor_raceacar() {
        assertFalse(ValidPalindrome.isPalindrome("race a car"));
    }

}