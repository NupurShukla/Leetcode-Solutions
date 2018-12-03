class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
        {
            return 0;
        }
        
        int r = grid.length;
        int c = grid[0].length;
        
        int perimeter = 0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(grid[i][j] == 1)
                {
                    int top = i-1>=0 ? grid[i-1][j] : 0;
                    int bottom = i+1<r ? grid[i+1][j] : 0;
                    int left = j-1>=0 ? grid[i][j-1] : 0;
                    int right = j+1<c ? grid[i][j+1] : 0;
                    
                    perimeter += (4-(top+bottom+left+right));
                }
            }
        }
        return perimeter;       
    }
}