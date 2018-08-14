/**
 * Definition for singly-linked list.
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp1 = headA;
        int l1 = 0;
        while(temp1!=null)
        {
            l1++;
            temp1=temp1.next;
        }
        
        ListNode temp2 = headB;
        int l2 = 0;
        while(temp2!=null)
        {
            l2++;
            temp2=temp2.next;
        }
        
        ListNode longPtr;
        ListNode shortPtr;
        int diff;
        if(l1>=l2)
        {
            longPtr = headA;
            shortPtr = headB;
            diff = l1-l2;
        }
        else
        {
            longPtr = headB;
            shortPtr = headA;
            diff = l2-l1;
        }
        
        for(int i=0; i<diff; i++)
        {
            longPtr=longPtr.next;
        }
        
        while(longPtr!=null && shortPtr!=null)
        {
            if(longPtr==shortPtr)
            {
                return longPtr;
            }
            longPtr=longPtr.next;
            shortPtr=shortPtr.next;
        }
        return null;
    }
}