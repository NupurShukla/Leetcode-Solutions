class Solution {
    
    public String reverseStr(String s, int k) {
        int len = s.length();
        if(len == 0 || k == 1)
        {
            return s;
        }
        char[] arr = s.toCharArray();
        int start=0;
        while(start < len)
        {
            int end = Math.min(len, start + k) - 1;
            
            int i= start;
            int j = end;
            while(i < j)
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            start = end + k + 1;
        }
        return String.valueOf(arr);
    }
}