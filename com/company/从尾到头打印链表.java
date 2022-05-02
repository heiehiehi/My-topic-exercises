package com.company;

import java.util.Arrays;
import java.util.Stack;

public class 从尾到头打印链表 {

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        A.next = B;
        B.next = C;
        System.out.println(Arrays.toString(reversePrint(A)));
    }

    public static int[] reversePrint(ListNode head) {
        if(head==null){
            return new int[]{};
        }
        Stack<Integer> n1 = new Stack<>();
        ListNode pre = head;
        while (pre!=null){
            n1.add(pre.val);
            pre = pre.next;
        }
        int ans[] = new int[n1.size()];
        for (int i = 0;i<ans.length;i++){
            ans[i] = n1.pop();
        }
        return ans;
    }
}
