class Solution {
    public int mySqrt(int x) {
        
        int lo = 1;
        int hi = x;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(mid == x/mid) return mid;
            else if(mid > x/mid){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        
        return lo-1;
    }
}