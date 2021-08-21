package puzzles.linkedlists;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // The most straightforward way to do it is to do one pass, counting the number of the nodes,
        // and then do a second pass up to the head.length - n and remove the node at this location.
        if (head.next == null) {
            return null;
        }
        int length = 1;
        ListNode pointer = head;
        while (pointer.next != null) {
            length++;
            pointer = pointer.next;
        }

        // skip to the node before the one we need to delete
        pointer = head;
        int positionToDelete = length - n;
        if (positionToDelete == 0) {
            // if we need to delete the head node
            head = head.next;
        } else {
            while (positionToDelete-- > 1) {
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
        }
        return head;
    }
}
