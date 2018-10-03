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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = left;
        root.left = right;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
}