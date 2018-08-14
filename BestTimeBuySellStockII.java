class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
        {
            return 0;
        }
        
        int prev = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++)
        {
            int temp=prices[i]-prices[i-1];
            temp= temp>0?temp:0;
            profit+=temp;
        }
        return profit;
    }
}