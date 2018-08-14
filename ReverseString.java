class Solution {
    public String reverseString(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        
        char[] temp = s.toCharArray();
        while(i<=j)
        {
            char t = temp[j];
            temp[j] = temp[i];
            temp[i] = t;
            i++;
            j--;
        }
        
        return String.valueOf(temp);
    }
}