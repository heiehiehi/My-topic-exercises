package 代码随想录;

public class 移除链表元素保留原头节点 {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val) {
        while (head!=null && head.val == val){
            head = head.next;
        }
        ListNode cur = head;
        while (cur!=null&&cur.next!=null){
            if (cur.next.val==val){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}