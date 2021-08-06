package puzzles.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStocksTest {
    @Test
    void shouldReturn7() {
        assertEquals(7, BuySellStocks.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    void shouldReturn4() {
        assertEquals(4, BuySellStocks.maxProfit(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void shouldReturn0() {
        assertEquals(0, BuySellStocks.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
}