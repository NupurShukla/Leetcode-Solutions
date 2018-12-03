class Solution {
    public int longestPalindrome(String s) {
        int[] lowerCount = new int[26];
        int[] upperCount = new int[26];
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            {
                upperCount[c-'A']++;
            }
            else
            {
                lowerCount[c-'a']++;
            }
        }
        
        boolean oddFound = false;
        int length = 0;
        for(int i=0; i<26; i++)
        {
            if(upperCount[i] % 2 == 0)
            {
                length += upperCount[i];
            }
            else
            {
                oddFound = true;
                length += (upperCount[i] - 1);
            }
            if(lowerCount[i] % 2 == 0)
            {
                length += lowerCount[i];
            }
            else
            {
                oddFound = true;
                length += (lowerCount[i] - 1);
            }
        }
        return oddFound? length+1: length;
    }
}