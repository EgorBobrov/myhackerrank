package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void shouldFindNoCycleInSingleNode() {
        ListNode start = new ListNode(1);
        assertFalse(LinkedListCycle.hasCycle(start));
    }

    @Test
    void shouldFindNoCycleInListWithNoCycle() {
        ListNode start = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertFalse(LinkedListCycle.hasCycle(start));
    }

    @Test
    void shouldFindCycleInListWithCycle() {
        ListNode start = new ListNode(1, new ListNode(2, new ListNode(3)));
        start.next.next.next = start;
        assertTrue(LinkedListCycle.hasCycle(start));
    }

}