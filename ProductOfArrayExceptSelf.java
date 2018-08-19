class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        
        output[0]=1;
        for(int i=1; i<len; i++)
        {
            output[i]=output[i-1]*nums[i-1];
        }
        
        int rightProd = nums[len-1];
        for(int i=len-2; i>=0; i--)
        {
            output[i]=output[i]*rightProd;
            rightProd*=nums[i];
        }
        return output;
    }
}