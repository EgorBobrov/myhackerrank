package puzzles.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void shouldReturn807_for_342_plus_465() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void shouldReturn0_for_0_plus_0() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void shouldReturn10009998_for_999999_plus_9999() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next.next.next);
    }
}