package puzzles.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void shouldBeValid_anagram_nagaram() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldBeInvalid_aa_bb() {
        assertFalse(ValidAnagram.isAnagram("aa", "bb"));
    }

    @Test
    void shouldBeInvalid_nl_cx() {
        assertFalse(ValidAnagram.isAnagram("nl", "cx"));
    }
}