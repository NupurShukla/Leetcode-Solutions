class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int r=A.length;
        int c=A[0].length;
        
        for(int i=0;i<r;i++)
        {
            for(int j=0,k=c-1; j<k; j++,k--)
            {
                int temp=A[i][j];
                A[i][j]=A[i][k];
                A[i][k]=temp;
            }
            
            for(int j=0;j<c;j++)
            {
                if(A[i][j]==0)
                {
                    A[i][j]=1;
                }
                else
                {
                    A[i][j]=0;
                }
            }
        }
        return A;
        
    }
}