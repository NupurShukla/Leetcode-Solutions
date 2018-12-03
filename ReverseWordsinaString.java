public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        int i = s.length()-1;
        int start, end;
        while(i>=0)
        {
            if(s.charAt(i) != ' ')
            {
                end = i;
                while(i >= 0 && s.charAt(i) != ' ')
                {
                    i--;
                }
                sb.append(s.substring(i+1, end+1));
                sb.append(" ");
            }
            i--;
        }
        return sb.toString().trim();
    }
}