package 代码随想录;

public class 移除链表元素虚拟头节点 {
    public static void main(String[] args) {
        //目的，让所有元素都按照统一方法删除

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode Virhead = new ListNode();
        Virhead.next = head;
        ListNode cur = Virhead;
        while (cur!=null&&cur.next!=null){
            if (cur.next.val==val){
                cur.next = cur.next.next;
                cur = cur.next;
            }
        }
        return Virhead.next;
    }
}
