package com.company;

import java.util.Stack;

public class 最小栈 {
    public static void main(String[] args) {
        MinStack A = new MinStack();
        A.push(0);
        A.push(1);
        A.push(0);
        System.out.println(A.getMin());
        A.pop();
        System.out.println(A.getMin());

    }
}
class MinStack {
        Stack<Integer> stack;
        int min;
        ListNode2 pre;

        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            if (stack.isEmpty()) {
                pre = new ListNode2(val);
                pre.val = val;
            }
            else if (pre.val >= val) {
                ListNode2 node = new ListNode2(val);
                node.val = val;
                pre.right = node;
                node.left = pre;
                pre = node;
            }
            stack.push(val);
        }

        public void pop() {
            if (stack.peek() == pre.val) {
                pre = pre.left;
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return pre.val;
        }

}
class ListNode2 {
        int val;
        ListNode2 right;
        ListNode2 left;

        ListNode2(int x) {
            x = val;
        }
}

