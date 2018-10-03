/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        int sum = l1.val + l2.val + carry;
        if(sum>9)
        {
            carry = 1;
        }
        ListNode temp = new ListNode(sum%10);
        ListNode head = temp;
        ListNode prev = temp;
        
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null || l2 != null)
        {
            int val1 = l1!=null?l1.val:0;
            int val2 = l2!=null?l2.val:0;
            
            sum = val1 + val2 + carry;
            carry = sum>9?1:0;

            temp = new ListNode(sum%10);
            prev.next = temp;
            prev = temp;
            l1 = l1!=null?l1.next:l1;
            l2 = l2!=null?l2.next:l2;
        }
        if(carry==0)
        {
            prev.next = null;
        }
        else
        {
            temp = new ListNode(1);
            prev.next = temp;
            temp.next = null;
        }
        return head;
    }
}