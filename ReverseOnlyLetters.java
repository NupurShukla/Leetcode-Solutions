class Solution {
    public String reverseOnlyLetters(String S) {
        char[] str = S.toCharArray();
        int i = 0;
        int j = S.length()-1;
        
        while(i<j)
        {
            while(!Character.isLetter(str[i]) && i<j)
            {
                i++;
            }
            while(!Character.isLetter(str[j]) && i<j)
            {
                j--;
            }
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(str);
    }
}