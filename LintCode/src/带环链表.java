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
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(head != null)
        {
            if(map.get(head) == null)
            {
                map.put(head, 1);
                head = head.next;
            }else return true;
        }
        return false;
    }
}
