class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        if(nums.length == 0)
        {
            return index;
        }
        
        int totalSum = 0;
        for(int i=0; i<nums.length; i++)
        {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(leftSum == totalSum-leftSum-nums[i])
            {
                index = i;
                break;
            }
            leftSum += nums[i];
        }
        return index;
    }
}