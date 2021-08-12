package puzzles.sortingandsearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void shouldReturn4() {
        FirstBadVersion underTest = new FirstBadVersion(4);
        assertEquals(4, underTest.firstBadVersion(5));
    }

}