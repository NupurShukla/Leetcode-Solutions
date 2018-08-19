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
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while(true)
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            
            if(stack.empty())
            {
                break;
            }
            
            root=stack.pop();
            inorder.add(root.val);
            root=root.right;
        }
        
        int diff=Integer.MAX_VALUE;
        for(int i=1; i<inorder.size(); i++)
        {
            int temp=inorder.get(i).intValue()-inorder.get(i-1).intValue();
            temp=Math.abs(temp);
            diff=Math.min(diff,temp);
        }
        return diff;
    }
}