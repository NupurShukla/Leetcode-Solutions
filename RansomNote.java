class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        Arrays.fill(charCount, 0);
        
        for(int i=0; i<magazine.length(); i++)
        {
            charCount[magazine.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<ransomNote.length(); i++)
        {
            charCount[ransomNote.charAt(i) - 'a']--;
            if(charCount[ransomNote.charAt(i) - 'a'] < 0)
            {
                return false;
            }
        }
        return true;
    }
}