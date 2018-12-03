/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        ListNode prev = head;
        ListNode curr = prev.next;
        while(curr != null && curr.next != null)
        {
            ListNode next = curr.next.next;
            curr.next.next = curr;
            prev.next = curr.next;
            curr.next = next;
            
            prev = curr;
            curr = next;
        }
        return dummy.next;
    }
}