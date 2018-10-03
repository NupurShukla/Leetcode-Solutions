/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        TreeNode dummy = new TreeNode(Integer.MIN_VALUE);
        dummy.left = null;
        dummy.right = null;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(dummy);
        
        List<Integer> right = new ArrayList<Integer>();
        while(queue.peek() != null)
        {
            TreeNode top = queue.poll();
            if(queue.peek() == dummy)
            {
                right.add(top.val);
            }
            else if(top == dummy)
            {
                if(queue.peek()!=null)
                {
                    queue.add(dummy);
                }
            }
            
            if(top.left != null)
            {
                queue.add(top.left);
            }
            if(top.right != null)
            {
                queue.add(top.right);
            } 
        }
        return right;
    }
}