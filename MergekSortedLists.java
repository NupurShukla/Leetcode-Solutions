/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class CustomComparator implements Comparator<ListNode>{
    public int compare(ListNode a, ListNode b)
    {
        if(a == null)
        {
            return b.val;
        }
        else if(b == null)
        {
            return a.val;
        }
        else
        {
            return a.val - b.val;
        }
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k==0)
        {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(k, new CustomComparator());
        
        //initialize
        for(int i=0; i<k; i++)
        {
            if(lists[i] != null)
            {
                pq.add(lists[i]);
            }
            
        }
        
        if(pq.peek() == null)
        {
            return null;
        }
        
        ListNode newHead = pq.poll();
        ListNode temp = newHead;
        ListNode removed = newHead;
        while(pq.peek() != null || removed.next != null)
        {
            if(removed.next != null)
            {
                pq.add(removed.next);
            }
            temp.next = removed;
            temp = temp.next;
            removed = pq.poll();     
        }
        
        temp.next = removed;
        temp = temp.next;
        temp.next = null;
        return newHead;
    }
}