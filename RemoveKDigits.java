class Solution { 
    public String removeKdigits(String num, int k) {
        
        int n = num.length();
        if(k >= n)
        {
            return "0";
        }
        
        int l = n-k;
        int i = 0;
        while(i < num.length()-1 && k > 0)
        {
            if(num.charAt(i) > num.charAt(i+1))
            {
                num = num.substring(0, i) + num.substring(i+1);
                if(i>0)
                {
                    i--;
                }
                k--;
            }
            else
            {
                i++;
            }
        }
         
        String answer = num.substring(0, l);
        
        // trim left zeros
        int j=0;
        while(j < answer.length() && answer.charAt(j) == '0')
        {
            j++;
        }
        answer = answer.substring(j);
        return answer.length()!=0 ? answer : "0";
    }
}