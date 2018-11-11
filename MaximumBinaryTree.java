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
    private int indexOfMax(int[] nums, int s, int e)
    {
        int maxVal = -1;
        int maxIndex = -1;
        for(int i=s; i<=e; i++)
        {
            if(nums[i] > maxVal)
            {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    private TreeNode constructMaximumBinaryTreeUtil(int[] nums, int s, int e)
    {
        if(s > e || s < 0 || e >= nums.length)
        {
            return null;
        }
        int index = indexOfMax(nums, s, e);
        TreeNode root = new TreeNode(nums[index]);
        root.left = constructMaximumBinaryTreeUtil(nums, s, index - 1);
        root.right = constructMaximumBinaryTreeUtil(nums, index + 1, e);
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return constructMaximumBinaryTreeUtil(nums, 0, nums.length-1);
        
    }
}