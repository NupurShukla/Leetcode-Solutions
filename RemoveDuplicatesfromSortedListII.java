/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return null;
        }
        boolean flag = false;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next;
        ListNode head2 = head;
        head2.next = null;
        ListNode temp = head2;
        
        if(curr != null && head.val == curr.val)
        {
            flag = true;
        }
        
        while(curr!=null)
        {
            next = curr.next;
            if(prev.val != curr.val)
            {
                if((next == null) || (next!=null && curr.val != next.val))
                {   
                    temp.next = curr;
                    temp = curr;
                    temp.next = null;
                }       
            }
            prev = curr;
            curr = next;
        }
        
        if(flag)
        {
            head2 = head2.next;
        }
        return head2;
    }
}