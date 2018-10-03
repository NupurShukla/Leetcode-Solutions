class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";
        
        List<String> answer = new ArrayList<String>();
        String[] rows = new String[]{firstRow, secondRow, thirdRow};
        
        for(String word : words)
        {
            char ch = word.charAt(0);
            int index;
            if(firstRow.indexOf(ch) !=-1)
            {
                index = 0;
            }
            else if(secondRow.indexOf(ch) !=-1)
            {
                index = 1;
            }
            else
            {
                index = 2;
            }

            boolean same = true;
            for(int i=1; i<word.length(); i++)
            {
                if(rows[index].indexOf(word.charAt(i)) == -1)
                {
                    same = false;
                    break;
                }
            }
            
            if(same)
            {
                answer.add(word);
            }        
        }
        
        String[] finalAns = new String[answer.size()];
        for(int i=0; i<answer.size(); i++)
        {
            finalAns[i] = answer.get(i);
        }
        
        return finalAns;
    }
}