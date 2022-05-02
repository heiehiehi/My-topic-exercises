package com.company;

import java.util.ArrayList;
import java.util.List;

public class 复杂链表的复制 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        List<Node> ans = new ArrayList<>();
        Node pre = head;
        while (pre!=null){
            ans.add(pre);
            pre = pre.next;
        }
        List<Node> ans2 = new ArrayList<>();
        for (int i = 0;i<ans.size();i++){
            Node newnode = new Node(ans.get(i).val);
            ans.get(i).next = newnode;
            ans2.add(newnode);
        }
        for (int i = 0;i<ans2.size();i++){
            ans2.get(i).random = ans.get(i).random.next;
            if (i<ans2.size()-1){
                ans2.get(i).next = ans2.get(i+1);
            }
            else {
                ans2.get(i).next = null;
            }
        }
        for (int i = 0;i<ans.size();i++){
            if (i<ans.size()-1){
                ans.get(i).next = ans.get(i+1);
            }
            else {
                ans.get(i).next = null;
            }
        }
        return ans2.get(0);
    }
}
