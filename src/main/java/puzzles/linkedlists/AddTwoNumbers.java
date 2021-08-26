package puzzles.linkedlists;

import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/783/
// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // The basic idea is to follow the logic of summing up integers from the leas significant digit:
        // if current digit sum is < 10, we just put it there.
        // if it's >= 10, we subtract 10, put the result in the list and carry 1.
        int carry = 0;
        int sumVal = l1.val + l2.val;
        if (sumVal >= 10) {
            sumVal -= 10;
            carry = 1;
        }
        ListNode result = new ListNode(sumVal);
        ListNode current = result;
        l1 = l1.next;
        l2 = l2.next;

        // we follow the lists while they are both empty...
        while (l1.next != null && l2.next != null) {
            sumVal = l1.val + l2.val + carry;
            if (sumVal >= 10) {
                sumVal -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.next = new ListNode(sumVal);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        // and then fill the rest of the result:
        while (l1.next != null) {
            sumVal = l1.val + carry;
            if (sumVal >= 10) {
                sumVal -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.next = new ListNode(sumVal);
            current = current.next;
            l1 = l1.next;
        }

        while (l2.next != null) {
            sumVal = l2.val + carry;
            if (sumVal >= 10) {
                sumVal -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.next = new ListNode(sumVal);
            current = current.next;
            l2 = l2.next;
        }

        if (carry == 1) {
            current.next = new ListNode(sumVal);
        }

        return result;
    }

}
