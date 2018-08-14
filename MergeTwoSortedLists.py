# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1:
            return l2
        if not l2:
            return l1
        
        l3 = None
        if l1.val < l2.val:
            l3 = l1
            l1 = l1.next
        
        else:
            l3 = l2
            l2 = l2.next
        head = l3
        
        while l1!=None and l2!=None:
            if l1.val < l2.val:
                l3.next = l1
                l1 = l1.next
        
            else:
                l3.next = l2
                l2 = l2.next
            l3 = l3.next
        
        while l1!=None:
            l3.next = l1
            l1=l1.next
            l3=l3.next
        while l2!=None:
            l3.next = l2
            l2=l2.next
            l3=l3.next
            
        return head
        
        
        