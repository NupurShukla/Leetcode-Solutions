class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int l = 0;
        int r = row-1;
        int searchRow = -1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            
            if(target >= matrix[mid][0] && target <= matrix[mid][col-1])
            {
                searchRow = mid;
                break;
            }
            else if(target > matrix[mid][0])
            {
                l = mid + 1;
            }
            else
            {
                r = mid -1;
            }
        }
        
        if(searchRow == -1)
        {
            return false;
        }
        
        int searchColumn = -1;
        l = 0;
        r = col-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            
            if(target == matrix[searchRow][mid])
            {
                searchColumn = mid;
                break;
            }
            else if(target > matrix[searchRow][mid])
            {
                l = mid + 1;
            }
            else
            {
                r = mid -1;
            }
        }
        if(searchColumn == -1)
        {
            return false;
        }
        
        return true;        
    }
}