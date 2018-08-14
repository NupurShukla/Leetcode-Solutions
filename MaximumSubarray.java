class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        if(len==0)
        {
            return 0;
        }
        
        int sum = nums[0];
        int max = sum;
        for(int i=1; i<len; i++)
        {
            if (sum < 0) 
                sum = nums[i];
            else 
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}