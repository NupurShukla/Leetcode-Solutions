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
    public List<Integer> inorderTraversal(TreeNode root) {
        
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
        return inorder;
        
    }
}