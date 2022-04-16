package com.company;

import java.math.BigInteger;

public class 两数相加 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l1.next = l12;
        l12.next = l13;
        l2.next = l22;
        l22.next = l23;
        ListNode ans = addTwoNumbers(l1,l2);
        ListNode pre = ans;
        while (pre!=null){
            System.out.println(pre.val);
            pre = pre.next;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        while (l1!=null){
            s1 = l1.val + s1;
            l1 = l1.next;
        }

        String s2 = "";
        while (l2!=null){
            s2 = l2.val + s2;
            l2 = l2.next;
        }
        BigInteger s11 = new BigInteger(s1+"");
        BigInteger s22 = new BigInteger(s2+"");
        s11 = s11.add(s22);
        String ans = s11.toString()+"";
        ListNode ans1 = new ListNode(0);
        ListNode pre = ans1;
        for (int i = ans.length()-1;i>=0;i--){
            pre.next = new ListNode(Integer.valueOf(ans.charAt(i)+""));
            pre = pre.next;
        }
        return ans1.next;
    }
}
