package com.company;

import java.util.PriorityQueue;

public class 排序链表 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode n2ode = new ListNode(1);
        ListNode n2ode1 = new ListNode(3);
        ListNode n2ode2 = new ListNode(4);
        node.next = node1;
        node1.next = node2;
        n2ode.next = n2ode1;
        n2ode1.next = n2ode2;
        node2.next = n2ode;
        ListNode ans = sortList(node);
        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    public static ListNode sortList(ListNode head) {
        if (head==null){
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((a,b)->(a.val-b.val));
        ListNode pre = head;
        while (pre!=null){
            priorityQueue.add(pre);
            pre = pre.next;
        }
        pre = priorityQueue.poll();
        head = pre;
        while (!priorityQueue.isEmpty()){
            pre.next = priorityQueue.poll();
            pre = pre.next;
        }
        pre.next = null;
        return head;
    }
}
