/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast!=null)
        {
            if(count>n)
            {
                slow=slow.next;
            }
            fast=fast.next;
            count++;
        }
        
        if(count==n)
        {
            head=head.next;
        }
        else
        {
            slow.next=slow.next.next;
        }
        
        return head;
    }
}