package com.company;

import java.util.ArrayList;
import java.util.List;

public class 相交链表 {
    public static void main(String[] args) {
        ListNode A = new ListNode(4);
        ListNode B = new ListNode(1);
        ListNode C = new ListNode(8);
        ListNode D = new ListNode(4);
        ListNode E = new ListNode(5);
        ListNode F = new ListNode(5);
        ListNode G = new ListNode(6);
        ListNode H = new ListNode(1);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;

        F.next = G;
        G.next = H;
        H.next = C;
        System.out.println(getIntersectionNode(A,F).val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<Integer> arr = new ArrayList<>();
        ListNode pre = headA;
        while(pre!=null){
            arr.add(pre.val);
            pre.val = -1;
            pre = pre.next;
        }

        pre = headB;
        boolean flag = true;
        while (pre!=null){
            if (pre.val==-1){
                pre.val = -2;
                flag = false;
                break;
            }
            pre = pre.next;
        }

        //还原
        pre = headA;
        ListNode ans = null;
        for (int i = 0;i<arr.size();i++){
            if (pre.val == -2){
                ans = pre;
            }
            pre.val = arr.get(i);
            pre = pre.next;
        }
        if (flag){
            return null;
        }

        return ans;
    }
}
