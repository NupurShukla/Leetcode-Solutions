class Solution {
    public boolean rotateString(String A, String B) {
        String AA = A + A;
        int index = AA.indexOf(B);
        if(A.length() != B.length() || index < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}