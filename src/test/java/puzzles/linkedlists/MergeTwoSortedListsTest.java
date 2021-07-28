package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void shouldMerge_1_2_4_And_1_3_4() {
        ListNode first = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode second = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode result = MergeTwoSortedLists.mergeTwoLists(first, second);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next);
    }

}