class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0)
        {
            return 0;
        }
        
        if(s.trim().equals(""))
        {
            return 1;
        }
        
        int[] indexMap = new int[26];
        int[] opt = new int[s.length()];
        Arrays.fill(indexMap, -1);
        
        int maxLength = 1;
        indexMap[s.charAt(0)-'a'] = 0;
        opt[0] = 1;
        
        for(int i=1; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(indexMap[ch-'a'] == -1)
            {
                indexMap[ch-'a'] = i;
                opt[i] = opt[i-1] + 1;
            }
            else
            {
                opt[i] = i-indexMap[ch-'a'];
                indexMap[ch-'a'] = i;
            }
            maxLength = Math.max(maxLength, opt[i]);
        }
        return maxLength;
        
    }
}