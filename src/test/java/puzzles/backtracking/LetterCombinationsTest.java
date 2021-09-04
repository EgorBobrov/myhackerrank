package puzzles.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    @Test
    void shouldReturnForEmpty() {
        assertEquals(List.of(),
                LetterCombinations.letterCombinations(""));
    }

    @Test
    void shouldReturnFor2() {
        assertEquals(List.of("a", "b", "c"),
                LetterCombinations.letterCombinations("2"));
    }

    @Test
    void shouldReturnFor23() {
        assertEquals(List.of("ad", "ae", "af",
                             "bd", "be", "bf",
                             "cd", "ce", "cf"),
                LetterCombinations.letterCombinations("23"));
    }

}