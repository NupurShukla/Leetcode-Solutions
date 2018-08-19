class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        if(len==0)
        {
            return 0;
        }
        
        int max=0;
        int maxSoFar=0;
        for(int i=0;i<len;i++)
        {
            maxSoFar+=nums[i];
            if(nums[i]==0)
            {
                max=Math.max(max, maxSoFar);
                maxSoFar=0;
            }  
        }
        return Math.max(max, maxSoFar);
    }
}