package puzzles.linkedlists;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
// Write a function to delete a node in a singly-linked list.
// You will not be given access to the head of the list,
// instead you will be given access to the node to be deleted directly.
//      It is guaranteed that the node to be deleted is not a tail node in the list.
//      The value of each node in the list is unique.
public class DeleteNodeFromList {
    // Since it's a non-circular single linked list, there is no way to actually
    // delete the node object we get the access to. However, if we assume that the equality
    // of the nodes is determined by their value, the task is rather simple:
    // 1. Set the value of the node to delete to the value of the next node
    // 2. Set current.next to the current.next.next
    // This way, we actually remove the next node, but since we save its value in the current,
    // and the original value of the current is gone, it's the same thing.
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
