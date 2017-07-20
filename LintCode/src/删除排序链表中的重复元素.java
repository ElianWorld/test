/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head == null || head.next == null) return head;
        ListNode p = head;
        while(p.next != null)
        {
            if(p.val == p.next.val) 
            {
                p.next = p.next.next;
            }
            else 
            {
                p = p.next;
            }
        }
        return head;
    }  
}