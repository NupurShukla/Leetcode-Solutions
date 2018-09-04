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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode dummy = new TreeNode(-1);
        dummy.left=null;
        dummy.right=null;
        
        List<Integer> currLevel = new ArrayList<Integer>();
        queue.add(root);
        queue.add(dummy);
        while(queue.peek()!=null)
        {
            root = queue.poll();
            if(root==dummy)
            {
                levelOrder.add(currLevel);
                currLevel = new ArrayList<Integer>();
                if(queue.peek()!=null)
                {
                    queue.add(dummy);
                }
                continue;
            }
            
            currLevel.add(root.val);
            if(root.left!=null)
            {
                queue.add(root.left);
            }
            if(root.right!=null)
            {
                queue.add(root.right);
            }
        }
        return levelOrder;
    }
}