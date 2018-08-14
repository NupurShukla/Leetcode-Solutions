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
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len==0)
        {
            return null;
        }
        int mid = len/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = construct(nums, 0, mid-1);
        root.right = construct(nums, mid+1, len-1);
        return root;
    }
    private TreeNode construct(int[] nums, int left, int right)
    {
        if(left>right || left<0 || right>=nums.length)
        {
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = construct(nums, left, mid-1);
        node.right = construct(nums, mid+1, right);
        return node;
    }
}