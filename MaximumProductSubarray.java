class Solution {
    public int maxProduct(int[] nums) {
        
        int answer = nums[0];
        int max = nums[0];
        int min = nums[0];
        
        for(int i=1; i<nums.length; i++)
        {
            int tempMax = max;
            int tempMin = min;
            
            max = Math.max(nums[i], Math.max(nums[i]*tempMax, nums[i]*tempMin));
            min = Math.min(nums[i], Math.min(nums[i]*tempMax, nums[i]*tempMin));
            
            answer= Math.max(answer, max);
        }
        return answer;
    }
}