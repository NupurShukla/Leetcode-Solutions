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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<Double>();
        if(root == null)
        {
            return averages;
        }
        TreeNode dummy = new TreeNode(Integer.MIN_VALUE);
        dummy.left=null;
        dummy.right=null;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(dummy);
        
        double sum=0;
        double count=0;
        while(queue.peek()!=null)
        {
            TreeNode top = queue.poll();
            if(top==dummy)
            {
                averages.add(sum/count);
                sum=0;
                count=0;
                
                if(queue.peek()!=null)
                {
                    queue.add(dummy);
                }
                continue;
            }
            
            sum+=top.val;
            count+=1;
            
            if(top.right!=null)
            {
                queue.add(top.right);
            }
            if(top.left!=null)
            {
                queue.add(top.left);
            }
        }
        
        return averages;
    }
}