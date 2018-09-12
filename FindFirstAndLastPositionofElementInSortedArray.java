class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int l = 0;
        int r = nums.length-1;
        
        int startIndex=-1;
        int endIndex=-1;
        int mid;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]==target)
            {
                if(mid==0 || nums[mid-1]!=target)
                {
                    startIndex=mid;
                    break;
                }
                else
                {
                    r = mid-1;
                }
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        
        l = 0;
        r = nums.length-1;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]==target)
            {
                if(mid==nums.length-1 || nums[mid+1]!=target)
                {
                    endIndex=mid;
                    break;
                }
                else
                {
                    l = mid+1;
                }
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        
        range[0]=startIndex;
        range[1]=endIndex;
        return range;
    }
}