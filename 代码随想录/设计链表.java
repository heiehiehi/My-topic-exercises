package 代码随想录;

public class 设计链表 {
    public static void main(String[] args) {
        MyLinkedList ans = new MyLinkedList();
        ans.addAtHead(1);
        ans.addAtTail(3);
        ans.addAtIndex(1,2);
        ans.deleteAtIndex(0);
        System.out.println();ans.get(0);
    }
}
class MyLinkedList {
    int size;
    LinkNode head;
    LinkNode tail;
    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index<0||index>=size){
            return -1;
        }
        else {
            int count = 0;
            LinkNode pre = head;
            while (count!=index){
                count++;
                pre = pre.next;
            }
            return pre.val;
        }
    }

    public void addAtHead(int val) {
        if (size == 0){
            head = new LinkNode(val);
            tail = head;
        }
        else {
            LinkNode temp = new LinkNode(val);
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size==0){
            addAtHead(val);
        }
        else {
            LinkNode temp = new LinkNode(val);
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index<=0){
            addAtHead(val);
        }
        else if (index==size){
            addAtTail(val);
        }
        else if (index>0&&index<size){
            int count = 1;
            LinkNode pre = head;
            while (count!=index){
                count++;
                pre = pre.next;
            }
            LinkNode temp = new LinkNode(val);
            temp.next = pre.next;
            pre.next = temp;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index>=size||index<0){
            return;
        }
        if (size == 1&&index==0){
            head = null;
            tail = null;
            size--;
            return;
        }
        if (index == 0){
            head = head.next;
            size--;
            return;
        }
        LinkNode cur = head;
        while (0<--index){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}
class LinkNode{
    int val;
    LinkNode next;
    public LinkNode(int val){
        this.val = val;
    }
}
