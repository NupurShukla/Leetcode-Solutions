class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        
        int re = matrix.length - 1;
        if(re<0)
        {
            return spiral;
        }
        int ce = matrix[0].length -1;
        
        int rs=0;
        int cs=0;
        while(rs<=re && cs<=ce)
        {
            for(int i=cs; i<=ce; i++)
            {
                spiral.add(matrix[rs][i]);
            }
            rs+=1;
            if(rs>re)
            {
                break;
            }
            for(int i=rs; i<=re; i++)
            {
                spiral.add(matrix[i][ce]);
            }
            ce-=1;
            if(cs>ce)
            {
                break;
            }
            for(int i=ce; i>=cs; i--)
            {
                spiral.add(matrix[re][i]);
            }
            re-=1;
            for(int i=re; i>=rs; i--)
            {
                spiral.add(matrix[i][cs]);
            }
            cs+=1;
        }
        return spiral;
    }
}