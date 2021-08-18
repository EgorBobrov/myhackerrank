package puzzles.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IntersectArraysTest {

    @Test
    void shouldReturn2_2() {
        assertArrayEquals(new int[]{2, 2},
                IntersectArrays.intersect(new int[]{9, 2, 5, 2},
                                        new int[]{1, 2, 2, 1}));
    }

    @Test
    void shouldReturn9_4() {
        int[] intersect = IntersectArrays.intersect(new int[]{9, 4, 5}, new int[]{9, 4, 9, 8, 4});
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < intersect.length; i++) {
            set.add(intersect[i]);
        }
        assertEquals(Set.of(9, 4), set);
    }

}