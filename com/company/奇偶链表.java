package com.company;

public class 奇偶链表 {
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode A1 = new ListNode(2);
        ListNode A2 = new ListNode(3);
        ListNode A3 = new ListNode(4);
        ListNode A4 = new ListNode(5);
        ListNode A5 = new ListNode(6);
        ListNode A6 = new ListNode(7);
        ListNode A7 = new ListNode(8);
        A.next = A1;
        A1.next = A2;
        A2.next = A3;
        A3.next = A4;
        A4.next = A5;
        A5.next = A6;
        A6.next = A7;
        oddEvenList(A);


    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode p1 = head;
        ListNode head1 = head;
        ListNode p2 = head.next;
        ListNode head2 = head.next;
        while (p1!=null&&p2!=null){
            p1.next = p2.next;
            p1 = p1.next;
            if (p1==null){
                break;
            }
            p2.next = p1.next;
            p2 = p2.next;
        }

        ListNode pre = head1;
        while (pre.next!=null){
            pre = pre.next;
        }
        pre.next = head2;
        return head1;
    }
}
