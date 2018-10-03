class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length - 1;
        // int expectedSum=n*(n+1)/2;
        // int actualSum=0;
        // for(int i=0; i<n+1; i++)
        // {
        //     actualSum += nums[i];
        // }
        // return actualSum-expectedSum;
        
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}