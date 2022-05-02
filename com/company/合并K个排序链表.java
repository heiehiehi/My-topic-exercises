package com.company;

import java.util.List;
import java.util.PriorityQueue;

public class 合并K个排序链表 {
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
        ListNode[] cao = new ListNode[2];
        cao[0] = node;
        cao[1] = n2ode;
        ListNode ans = mergeKLists(cao);
        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        PriorityQueue<Integer> ans = new PriorityQueue<>((a,b)->(a-b));
        for (int i=0;i<lists.length;i++){
            ListNode pre = lists[i];
            while (pre!=null){
                ans.add(pre.val);
                pre=pre.next;
            }
        }
        if (ans.isEmpty()){
            return null;
        }
        ListNode pre = new ListNode(ans.poll());
        ListNode head = pre;
        while (!ans.isEmpty()){
            ListNode node = new ListNode(ans.poll());
            pre.next = node;
            pre = node;
        }
        return head;
    }
}
