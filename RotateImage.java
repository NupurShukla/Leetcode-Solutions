class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
        {
            return;
        }
        
        int n = matrix.length;
        int k = n - 1;
        for(int i = 0; i < n/2; i++)
        {
            for(int j = i; j < k-i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k-j][i];
                matrix[k-j][i] = matrix[k-i][k-j];
                matrix[k-i][k-j] = matrix[j][k-i];
                matrix[j][k-i] = temp;
            }
        }
    }
}