class Solution {
    public int myAtoi(String str) {
        if(str.length() == 0)
        {
            return 0;
        }
        long num = 0;
        long sign = 1;
        int i = 0;
        while(i < str.length())
        {
            if(str.charAt(i) != ' ')
            {
                break;
            }
            i++;
        }
        if(i == str.length())
        {
            return 0;
        }
        
        if(str.charAt(i) == '-' || str.charAt(i) == '+')
        {
            sign = str.charAt(i) == '-'? -1: 1;
            i++;
        }
        while(i < str.length())
        {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9')
            {
                num = (num*10) + Character.getNumericValue(c);
                long ans = sign*num;
                if(ans < Integer.MIN_VALUE)
                {
                    return Integer.MIN_VALUE;
                }
                else if(ans > Integer.MAX_VALUE)
                {
                    return Integer.MAX_VALUE;
                }
                i++;
            }
            else
            {
                break;
            }
        }
        
        long ans = sign*num;
        if(ans < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        else if(ans > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return (int)ans;
        }
    }
}