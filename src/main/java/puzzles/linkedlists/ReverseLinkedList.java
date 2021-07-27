package puzzles.linkedlists;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkedList {
      public static class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }

    public static ListNode reverseList(ListNode head) {
        // The most obvious way to reverse a singly linked list is to go from start to finish,
        // and for each node:
        // saving the "next" node in a variable
        // set it's "next" pointer to point at the previous node
        // calling the function with the saved next node and the current node
        // as new current and previous
        // finally returning the node for which there is no next node
        ListNode next = head.next;
        head.next = null;
        return performReverse(head, next);
    }

    private static ListNode performReverse(ListNode previous, ListNode current) {
        if (current == null) {
            return previous;
        }
        ListNode next = current.next;
        current.next = previous;
        return performReverse(current, next);
    }

}
