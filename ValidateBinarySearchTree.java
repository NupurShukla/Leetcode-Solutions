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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> inorder = new ArrayList<Integer>();
        
        while(true)
        {
            while(root!=null)
            {
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
            {
                break;
            }
            
            root = stack.pop();
            inorder.add(root.val);
            root = root.right;
        }
        
        for(int i=1; i<inorder.size(); i++)
        {
            if(inorder.get(i) <= inorder.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}