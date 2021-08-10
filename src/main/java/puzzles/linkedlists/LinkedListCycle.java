package puzzles.linkedlists;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
// Given head, the head of a linked list, determine if the linked list has a cycle in it.
// There is a cycle in a linked list if there is some node in the list
// that can be reached again by continuously following the next pointer.
// Return true if there is a cycle in the linked list. Otherwise, return false.
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        // One possible way of solving that is to save every node we visit in a Set.
        // If we try to save a node that already exists in the set, we know there is a cycle.
        // This would take O(n) time (to visit every node) and O(n) extra space.

        // An approach that doesn't require extra memory can involve 2 iterators:
        // one doing 1 step and another 2 steps. If there is no cycle, the second iterator will
        // reach the end of the list. If there is a cycle, at some point the two iterators will have
        // to point to the same element: when j (2-step) is closing in on i (1-step),
        // they are either at the same index or will be at the same index at the next step:
        // [1, 2, 3, 4j, 5i] -> [1ij, 2, 3, 4, 5]
        ListNode goingOneStep = head;
        ListNode goingTwoSteps = head;

        while (takeTwoSteps(goingTwoSteps) != null) {
            goingTwoSteps = takeTwoSteps(goingTwoSteps);
            goingOneStep = goingOneStep.next;
            if (goingOneStep == goingTwoSteps) return true;
        }

        return false;
    }

    private static ListNode takeTwoSteps(ListNode start) {
        if (start == null) return start;
        if (start.next != null) return start.next.next;
        return start.next;
    }
}
