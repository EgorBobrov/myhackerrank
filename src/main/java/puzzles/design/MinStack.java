package puzzles.design;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/562/
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class containing integer values:
/*
 * MinStack() initializes the stack object.
 * void push(val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the smallest element in the stack.
 */
public class MinStack {
    // The best data structure for implementing a Stack is a linked list:
    // with constant time retrieval, addition and removal of elements at the beginning,
    // and easily resizeable. Since there are no operations to retrieve element in the middle,
    // the main drawback of Linked List (linear time access by index) is irrelevant.

    // Since we also have to support getMin() operation, we could have 2 pointers:
    // to the top stack element and to the smallest element.
    // However, to be really efficient, we can use a different approach:
    // store in each node the minimal value encountered so far and update it in the new top node
    // if its value is smaller than the current minimum.
    private StackNode top;

    private class StackNode {
        private final int value;
        public final int minValueSoFar;
        private StackNode next;
        private StackNode(int value, StackNode next) {
            this.value = value;
            if (next == null) {
                minValueSoFar = value;
            } else {
                minValueSoFar = Math.min(value, next.minValueSoFar);
            }
        }
    }

    public MinStack() {}

    public void push(int val) {
        StackNode newTop = new StackNode(val, top);
        newTop.next = top;
        top = newTop;
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.minValueSoFar;
    }

}
