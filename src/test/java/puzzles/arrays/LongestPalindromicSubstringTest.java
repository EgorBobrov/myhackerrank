package puzzles.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void shouldReturn_bab_for_babad(){
        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
    }

    @Test
    void shouldReturn_bb_for_cbbd(){
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    void shouldReturn_aca_for_aacabdkacaa(){
        assertEquals("aca", LongestPalindromicSubstring.longestPalindrome("aacabdkacaa"));
    }
}