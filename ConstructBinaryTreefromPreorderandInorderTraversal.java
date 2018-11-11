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
    private Map<Integer, Integer> inorderMap;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0)
        {
            return null;
        }
        inorderMap = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++)
        {
            inorderMap.put(inorder[i], i);
        }
        
        return build(inorder, preorder, 0, inorder.length-1, 0);   
    }
    
    private TreeNode build(int[] inorder, int[] preorder, int s, int e, int r)
    {
        if(s > e || s < 0 || e > inorder.length)
        {
            return null;
        }
        
        int rootVal = preorder[r];
        TreeNode root = new TreeNode(rootVal);
        if(s == e)
        {
            root.left = null;
            root.right = null;
            return root;
        }
        else
        {
            int index = inorderMap.get(rootVal);
            root.left = build(inorder, preorder, s, index - 1, r + 1); 
            root.right = build(inorder, preorder, index + 1, e,  r + (index - s + 1)); 
            return root;
        }
    }
}