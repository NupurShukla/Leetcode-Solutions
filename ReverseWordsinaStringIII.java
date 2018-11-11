class Solution {
    private void reverseWord(char[] word, int si, int ei)
    {
        while(si<=ei)
        {
            char temp = word[si];
            word[si] = word[ei];
            word[ei] = temp;
            si++;
            ei--;
        }
    }
    
    public String reverseWords(String s) {
        char[] string = s.toCharArray();
        int si = 0;
        for(int i=0; i<string.length; i++)
        {
            if(string[i]==' ')
            {
                int ei = i-1;
                reverseWord(string, si, ei);
                si = i+1;
            }
        }
        
        reverseWord(string, si, string.length-1);
        return String.valueOf(string);
    }
}