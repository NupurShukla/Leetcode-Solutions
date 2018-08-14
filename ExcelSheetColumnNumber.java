class Solution {
    public int titleToNumber(String s) {
        char[] temp = s.toCharArray();
        int number = 0;
        int len = s.length();
        int power =0;
        for(int i=len-1;i>=0;i--)
        {
            int n = temp[i]-'A'+1;
            int p = (int)Math.pow(26, power);
            number+=(n*p);
            power++;
        }
        return number;
    }
}