class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
        {
            return matrix;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] distMatrix = new int[row][col];
        
        int defaultVal = Integer.MAX_VALUE - 100000;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    distMatrix[i][j] = 0;
                }
                
                else
                {
                    int top = i==0? defaultVal : distMatrix[i-1][j];
                    int left = j==0? defaultVal : distMatrix[i][j-1];
                    distMatrix[i][j] = 1 + Math.min(top, left);
                }
            }
        }
        
        for(int i=row-1; i>=0; i--)
        {
            for(int j=col-1; j>=0; j--)
            {
                if(matrix[i][j] == 0)
                {
                    distMatrix[i][j] = 0;
                }
                
                else
                {
                    int bottom = i==row-1? defaultVal : distMatrix[i+1][j];
                    int right = j==col-1? defaultVal : distMatrix[i][j+1];
                    distMatrix[i][j] = Math.min(distMatrix[i][j], 1 + Math.min(bottom, right));
                }
            }
        }
        return distMatrix;      
    }
}