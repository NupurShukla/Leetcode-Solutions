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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
        {
            return ans;
        }
        
        TreeNode dummy = new TreeNode(0);
        dummy.left = null;
        dummy.right = null;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(dummy);
        
        List<Integer> currAns = new LinkedList<Integer>();
        int currLevel = 1;
        //int size = 0;
        while(queue.peek() != null)
        {
            TreeNode curr = queue.poll();
            if(curr == dummy)
            {
                ans.add(currAns);
                if(queue.peek() != null)
                {
                    queue.add(dummy);
                    currLevel++;
                    currAns = new LinkedList<Integer>();
                }
            }
            else
            {
                if(currLevel%2 == 1)
                    currAns.add(curr.val);
                else
                    currAns.add(0, curr.val);
                
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }   
        }
        return ans; 
    }
}