class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        
        if(len==0 || s.charAt(0)=='0')
        {
            return 0;
        }
        
        int[] dp = new int[len+1];
        dp[0]=1;
        dp[1]=1;
        
        int prev = Character.getNumericValue(s.charAt(0));
        for(int i=2; i<=len; i++)
        {
            int curr = Character.getNumericValue(s.charAt(i-1));
            if(curr!=0)
            {
                dp[i]=dp[i-1];
            }
            else if(prev==1 || prev==2)
            {
                dp[i]=dp[i-2];
            }
            if((prev==1 && curr>=1 && curr<=9) || (prev==2 && curr>=1 && curr<=6))
            {
                dp[i]=dp[i]+dp[i-2];
            }
            prev = curr;
        }
        return dp[len];
    }
}