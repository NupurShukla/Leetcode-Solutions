class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase();
        char[] s1 = s.toCharArray();
        int i=0;
        int j=len-1;
        while(i<=j)
        {
            if(!Character.isDigit(s1[i]) && !Character.isLetter(s1[i]))
            {
                i++;
            }
            else if(!Character.isDigit(s1[j]) && !Character.isLetter(s1[j]))
            {
                j--;
            }
            else if(s1[i]!=s1[j])
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}