package 代码随想录;

public class 删除链表的倒数第n个节点快慢指针 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virhead = new ListNode();
        virhead.next = head;
        head = virhead;
        ListNode fast = head;
        ListNode slow = head;
        while (n>0){
            n--;
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
