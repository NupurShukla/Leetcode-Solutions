class Solution {
    private int getArea(int[] height, int startIndex, int lastIndex)
    {
        return (lastIndex-startIndex)*(Math.min(height[startIndex], height[lastIndex]));
    }
    
    public int maxArea(int[] height) {
        int startIndex=0;
        int lastIndex=height.length-1;
      
        int maxArea = getArea(height, startIndex, lastIndex);
        
        while(startIndex<lastIndex)
        {
            if(height[startIndex]<height[lastIndex])
            {
                startIndex++;
            }
            else
            {
                lastIndex--;
            }
            maxArea = Math.max(maxArea, getArea(height, startIndex, lastIndex));
        }
        return maxArea;
    }
}