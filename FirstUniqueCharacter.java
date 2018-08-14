class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        Arrays.fill(count,0);
        char[] temp = s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {
            count[temp[i]-'a']++;
        }
        int index = -1;
        for(int i=0; i<s.length(); i++)
        {
            if(count[temp[i]-'a']==1)
            {
                index = i;
                break;
            }
        }
        return index;
    }
}