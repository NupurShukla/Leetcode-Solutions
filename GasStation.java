class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
       
        int diff;
        int sum = 0;
        int totalSum = 0;
        int guess = 0;
        for(int i=0; i<n; i++)
        {
            //i=i%n;
            diff = gas[i]-cost[i];
            sum += diff;
            totalSum += diff;
            
            if(sum<0)
            {
                guess = i+1;
                sum = 0;
            }  
        }
        
        if(totalSum<0)
        {
            guess = -1;
        }
        return guess;
    }
}