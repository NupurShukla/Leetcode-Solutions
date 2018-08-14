class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int divide = 5;
        while(n>0)
        {
            count+=(n/5);
            n/=5;
        }
        return count;
    }
}