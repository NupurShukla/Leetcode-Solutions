class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        int l = 0;
        int r = len-1;
        int index = -1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(A[mid-1]<A[mid] && A[mid]<A[mid+1])
            {
                l=mid+1;
            }
            else if(A[mid-1]<A[mid] && A[mid]>A[mid+1])
            {
                index=mid;
                break;
            }
            else
            {
                r=mid-1;
            }
        }
        return index;  
    }
}