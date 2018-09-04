class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] opt = new boolean[len];
        Arrays.fill(opt, false);
        
        opt[0]=true;
        for(int i=0; i<len; i++)
        {
            if(opt[i]==true)
            {
                for(int j=i+1; j<Math.min(i+1+nums[i], len); j++)
                {
                    opt[j]=true;
                }
            }
        }
        return opt[len-1];
    }
}