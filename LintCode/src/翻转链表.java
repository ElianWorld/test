/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null || head.next == null) return head;
        ListNode p = head;
        ListNode he = head;
        ListNode q;
        while(he.next != null)
        {
            q = he.next;
            he.next = q.next;
            q.next = p;
            p = q;
        }
        return p;
    }
}
