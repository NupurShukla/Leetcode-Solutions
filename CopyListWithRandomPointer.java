/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
        {
            return null;
        }
        
        HashMap<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
        
        RandomListNode head2 = new RandomListNode(head.label);
        nodeMap.put(head, head2);
        RandomListNode prev = head2;
        RandomListNode temp2;
        
        RandomListNode temp = head.next;
        while(temp!=null)
        {
            temp2 = new RandomListNode(temp.label);
            nodeMap.put(temp, temp2);
            
            prev.next = temp2;
            prev = temp2;
            
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null)
        {
            if(temp.random != null)
            {
                nodeMap.get(temp).random = nodeMap.get(temp.random);
            }
            else
            {
                nodeMap.get(temp).random = null;
            }
            temp = temp.next;
        }
        return head2;
    }
}