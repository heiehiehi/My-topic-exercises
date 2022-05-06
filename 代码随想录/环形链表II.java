package 代码随想录;

public class 环形链表II {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null&&slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
