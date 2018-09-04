class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        if(n==0)
        {
            return 0;
        }
        
        int[] opt = new int[n];
        opt[0]=1;
        int answer=1;
        
        for(int i=1; i<n; i++)
        {
            int max=1;
            for(int j=0; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                    max = Math.max(max, opt[j]+1);
                }
            }
            opt[i] = max;
            answer= Math.max(max, answer);
        }
        return answer;
    }
}