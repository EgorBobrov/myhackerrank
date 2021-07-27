package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static puzzles.linkedlists.ReverseLinkedList.ListNode;

class ReverseLinkedListTest {

    @Test
    void shouldReverse1_2_3_4_5() {
        ListNode listStart =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));
        ListNode result = ReverseLinkedList.reverseList(listStart);
        assertEquals(result.val, 5);
        assertEquals(result.next.val, 4);
        assertEquals(result.next.next.val, 3);
        assertEquals(result.next.next.next.val, 2);
        assertEquals(result.next.next.next.next.val, 1);
        assertNull(result.next.next.next.next.next);
    }

}