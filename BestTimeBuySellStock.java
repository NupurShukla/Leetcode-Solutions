class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profitSoFar = 0;
        
        if(prices.length == 0)
        {
            return 0;
        }
        
        int prev = prices[0];
        for(int i=1; i<prices.length; i++)
        {
            int temp = profitSoFar + prices[i] - prev;
            profitSoFar = (temp>0?temp:0);
            if(profitSoFar>maxProfit)
            {
                maxProfit = profitSoFar;
            }
            prev = prices[i];
        }
        return maxProfit;
    }
}