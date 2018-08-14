class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        
        if(numRows==0)
        {
            return pascal;
        }
        
        row.add(1);
        pascal.add(row);
        
        List<Integer> prev = new ArrayList<Integer>();
        prev = row;
        
        for(int i=2; i<=numRows; i++)
        {
            row = new ArrayList<Integer>();
            row.add(1);
            
            for(int j=0; j<prev.size()-1; j++)
            {
                int sum = prev.get(j) + prev.get(j+1);
                row.add(sum);
            }
            
            row.add(1);
            pascal.add(row);
            prev = row;
        }
        return pascal;
    }
}