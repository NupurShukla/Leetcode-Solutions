class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0; i<nums.length; i++)
        {
            int end = Math.min(i+k+1, nums.length);
            for(int j=i+1; j<end; j++)
            {
                if(Math.abs((long)nums[i] - (long)nums[j]) <= t) 
                {
                    return true;
                }
            }
        }
        return false;
    }
}