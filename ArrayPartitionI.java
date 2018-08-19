class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sumOfMin=0;
        for(int i=0; i<nums.length; i+=2)
        {
            sumOfMin+=nums[i];
        }
        return sumOfMin;
    }
}