class Solution {
    private List<String> permutations;
    
    private void permute(char[] str, int l, int r)
    {
        if(l==r)
        {
            permutations.add(String.valueOf(str));
        }
        
        else
        {
            char c = str[l];
            permute(str, l+1, r);
            if(Character.isLetter(c))
            {
                if(Character.isLowerCase(c))
                {
                    str[l] = Character.toUpperCase(c);
                }
                else
                {
                    str[l] = Character.toLowerCase(c);
                }
                permute(str, l+1, r);
            }
        } 
    }
    
    public List<String> letterCasePermutation(String S) {
        permutations = new ArrayList<String>();
        char[] str = S.toCharArray();
        permute(str, 0, S.length());
        return permutations;
    }
}