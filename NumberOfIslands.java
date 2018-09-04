class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid[0].length==0)
        {
            return 0;
        }
        
        int r = grid.length;
        int c = grid[0].length;
        int islands=0;
        
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c; j++)
            {
                if(grid[i][j]=='1')
                {
                    countIslands(grid, r, c, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    private void countIslands(char[][] grid, int r, int c, int i, int j)
    {
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]=='0')
        {
            return;
        }
        else
        {
            grid[i][j]='0';
            countIslands(grid, r, c, i+1, j);
            countIslands(grid, r, c, i-1, j);
            countIslands(grid, r, c, i, j+1);
            countIslands(grid, r, c, i, j-1);
        }
        
        return;
    }
}