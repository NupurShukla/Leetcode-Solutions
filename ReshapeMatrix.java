class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
        {
            return nums;
        }
        
        int row = 0;
        int col = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[0].length; j++)
            {
                res[row][col] = nums[i][j];
                col++;
                if(col == c)
                {
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}