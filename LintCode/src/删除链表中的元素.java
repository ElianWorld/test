class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class 删除链表中的元素 {
	/**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode p = head;
        while(p != null)
        {
            if(p.val == val) p = p.next;
            else break;
        }
        head = p;
        if(p == null) return p;
        ListNode q = p.next;
        while(q != null)
        {
            if(q.val == val)
            {
                p.next = q.next;
                q = p.next;
                continue;
            }
            p = p.next;
            q = p.next;
        }
        return head;
    }
}
