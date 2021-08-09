package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeFromListTest {
    @Test
    void shouldRemove3From1_2_3_4_5() {
        ListNode listStart =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));
        DeleteNodeFromList.deleteNode(listStart.next.next);
        assertEquals(listStart.val, 1);
        assertEquals(listStart.next.val, 2);
        assertEquals(listStart.next.next.val, 4);
        assertEquals(listStart.next.next.next.val, 5);
        assertNull(listStart.next.next.next.next);
    }
}