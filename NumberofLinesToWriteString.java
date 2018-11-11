class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        
        if(S.length() == 0)
        {
            int[] output = new int[]{0, 0};
            return output;
        }
        int line = 1;
        int maxWidth = 100;
        int remainingWidth = maxWidth;
        for(int i=0; i<S.length(); i++)
        {
            char c = S.charAt(i);
            int width = widths[c - 'a'];
            if(width <= remainingWidth)
            {
                remainingWidth -= width;
            }
            else
            {
                line += 1;
                remainingWidth = maxWidth-width;
            }
        }
        
        int[] output = new int[]{line, maxWidth - remainingWidth};
        return output;
        
    }
}