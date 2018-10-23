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
    boolean balanced = true;
    
    private int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int l = height(root.left);
        int r = height(root.right);
        
        if(Math.abs(l-r)>1)
        {
            balanced = false;
        }
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced;
    }
}