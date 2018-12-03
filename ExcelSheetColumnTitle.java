class Solution {
    public String convertToTitle(int n) {
        
        String title = "";
        while(n>0)
        {
            n = n-1;
            int l = n%26;
            char c = (char)(l + 65);
            title = String.valueOf(c) + title; 
            
            n = n/26;
        }
        return title;
    }
}