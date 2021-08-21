package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    @Test
    void shouldOutput_1_2_3_5_whenRemoving2ndElementFrom1_2_3_4_5() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = RemoveNthFromEnd.removeNthFromEnd(head, 2);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    void shouldOutput_2_3_4_5_whenRemoving5thElementFrom1_2_3_4_5() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = RemoveNthFromEnd.removeNthFromEnd(head, 5);
        assertEquals(2, head.val);
        assertEquals(3, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }
}