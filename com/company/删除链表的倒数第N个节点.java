package com.company;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class 删除链表的倒数第N个节点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode A = new ListNode(4);
        ListNode B = new ListNode(5);
        ListNode C = new ListNode(1);
        ListNode D = new ListNode(9);
        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
        ListNode pre = A;
        head = deleteNode(A,4);

        pre = head;
        while(pre!=null){
            System.out.println(pre.val);
            pre = pre.next;
        }

    }
    public static ListNode deleteNode(ListNode head,int n) {
        int sum = 0;
        ListNode pre = head;
        int ans = 0;
        while (pre!=null){
            pre = pre.next;
            ans++;
        }
        int get = ans - n+1;
        pre = head.next;
        if (get == 1){
            return head.next;
        }
        pre = head;
        for (int i=1;i<get-1;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}

