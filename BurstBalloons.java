class Solution {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        if(len == 0)
        {
            return 0;
        }
        int[][] dp = new int[len][len];
        
        for(int width = 0; width<len; width++)
        {
            for(int i=0; i<len-width; i++)
            {
                int j = Math.min(i+width, len-1);
                int max = 0;
                for(int k=i; k<=j; k++)
                {
                    int left = (i-1)>=0?nums[i-1]:1;
                    int right = (j+1)<len?nums[j+1]:1;
                    int a = (k-1)>=0?dp[i][k-1]:0;
                    int b = (k+1)<len?dp[k+1][j]:0;
                    int temp = a + b + (left*nums[k]*right);
                    max = Math.max(temp, max);
                }
                dp[i][j] = max;
            }
        }
        return dp[0][len-1];
    }
}