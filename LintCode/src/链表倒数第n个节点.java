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
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode p = head;
        int i = 1;
        while(p != null)
        {
            map.put(i, p);
            p = p.next;
            i++;
        }
        return map.get(i-n);
    }
}
