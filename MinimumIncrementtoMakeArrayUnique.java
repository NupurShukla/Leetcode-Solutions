class Solution {
    public int minIncrementForUnique(int[] A) {
        if(A.length == 0)
        {
            return 0;
        }
        
        Arrays.sort(A);
        int maxSoFar = A[0];
        int moves = 0;
        for(int i=1; i<A.length; i++)
        {
            if(A[i] <= maxSoFar)
            {
                maxSoFar = maxSoFar + 1;
                moves += (maxSoFar - A[i]);
                
            }
            else
            {
                maxSoFar = A[i];
            }
        }
        return moves;
    }
}