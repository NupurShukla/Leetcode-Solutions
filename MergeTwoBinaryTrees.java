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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
        {
            return null;
        }
        
        TreeNode root = new TreeNode(0);
        TreeNode left1 = null, left2 = null, right1 = null, right2 = null;
        if(t1 != null)
        {
            root.val += t1.val;
            left1 = t1.left;
            right1 = t1.right;
        }
        if(t2 != null)
        {
            root.val += t2.val;
            left2 = t2.left;
            right2 = t2.right;
        }
        root.left = mergeTrees(left1, left2);
        root.right = mergeTrees(right1, right2);
        return root;     
    }
}