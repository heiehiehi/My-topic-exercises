package com.company;

public class 删除链表中的节点 {
    public static void main(String[] args) {
        ListNode A = new ListNode(4);
        ListNode B = new ListNode(5);
        ListNode C = new ListNode(1);
        ListNode D = new ListNode(9);
        A.next = B;
        B.next = C;
        C.next = D;
        ListNode pre = A;
        while(pre!=null){
            System.out.println(pre.val);
            pre = pre.next;
        }
        deleteNode(B);
        pre = A;
        B.val = B.next.val;
        B.next = B.next.next;
        while(pre!=null){
            System.out.println(pre.val);
            pre = pre.next;
        }

    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) { val = x; }
}
