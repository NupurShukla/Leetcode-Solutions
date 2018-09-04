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
    public int kthSmallest(TreeNode root, int k) {
        int count=0;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        
        while(true)
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            
            root=stack.pop();
            count++;
            if(count==k)
            {
                return root.val;
            }
            root=root.right;
        }
    }
}