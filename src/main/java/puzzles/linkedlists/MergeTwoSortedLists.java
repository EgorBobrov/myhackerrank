package puzzles.linkedlists;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/771/
// Merge two sorted linked lists and return it as a sorted list.
// The list should be made by splicing together the nodes of the first two lists.
// Both l1 and l2 are sorted in non-decreasing order.
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // handle the edge cases
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        // So, the idea is pretty straightforward:
        // we check which list node is smaller and mark it as the beginning.
        ListNode result = l1.val < l2.val ? l1: l2;
        // Then, we need to have a pointer to the next element to add from the first list
        // and the second list.
        ListNode currentNode = result;
        ListNode firstPointer = result == l1 ? l1.next : l1;
        ListNode secondPointer = result == l2 ? l2.next : l2;
        // While at leas one of them is not null,
        // we pick the one with the smallest value, and update the pointer
        while (firstPointer != null && secondPointer != null) {
            currentNode.next = firstPointer.val < secondPointer.val ? firstPointer : secondPointer;
            if (currentNode.next == firstPointer) {
                firstPointer = firstPointer.next;
            } else {
                secondPointer = secondPointer.next;
            }
            currentNode = currentNode.next;
        }
        if (firstPointer == null) {
            currentNode.next = secondPointer;
        } else  {
            currentNode.next = firstPointer;
        }
        return result;
    }
}
