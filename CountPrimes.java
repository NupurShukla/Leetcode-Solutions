class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n+1];
        Arrays.fill(isPrime, 1);
        
        int count = 0;
        for(int i=2; i<n; i++)
        {
            if(isPrime[i]==1)
            {
                count++;
                for(int j=2; i*j<=n; j++)
                {
                    isPrime[i*j]=0;
                }
            }
        }
        return count;
    }
}