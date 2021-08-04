package puzzles.math;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldWorkFor3() {
        assertEquals(List.of("1", "2", "Fizz"), FizzBuzz.fizzBuzz(3));
    }

    @Test
    void shouldWorkFor5() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), FizzBuzz.fizzBuzz(5));
    }

    @Test
    void shouldWorkFor15() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz",
                            "Fizz", "7", "8", "Fizz", "Buzz",
                            "11", "Fizz", "13", "14", "FizzBuzz"), FizzBuzz.fizzBuzz(15));
    }

}