package puzzles.strings;

import org.junit.jupiter.api.Test;
import puzzles.strings.FirstUniqueCharInString;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharInStringTest {

    @Test
    void shouldReturn0for_leetcode() {
        int firstUniqCharIndex = FirstUniqueCharInString.firstUniqChar("leetcode");
        assertEquals(0, firstUniqCharIndex);
    }

    @Test
    void shouldReturn2for_loveleetcode() {
        int firstUniqCharIndex = FirstUniqueCharInString.firstUniqChar("loveleetcode");
        assertEquals(2, firstUniqCharIndex);
    }

    @Test
    void shouldReturnNeg1for_aabb() {
        int firstUniqCharIndex = FirstUniqueCharInString.firstUniqChar("aabb");
        assertEquals(-1, firstUniqCharIndex);
    }

}