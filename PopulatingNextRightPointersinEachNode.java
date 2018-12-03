/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    private void connectUtil(TreeLinkNode curr, TreeLinkNode next){
        if(curr == null)
        {
            return;
        }
        curr.next = next;
        connectUtil(curr.left, curr.right);
        connectUtil(curr.right, next == null? null: next.left);
    }
    
    public void connect(TreeLinkNode root) { 
        connectUtil(root, null);
    }
}