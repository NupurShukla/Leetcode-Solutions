class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        int[] B = new int[A.length];
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2 == 0)
            {
                B[even] = A[i];
                even += 2;
            }
            else
            {
                B[odd] = A[i];
                odd += 2;
            }
        }
        return B;
    }
}