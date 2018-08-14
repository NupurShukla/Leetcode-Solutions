class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        lcp = ""
        
        if len(strs) >=1:
            lcp = strs[0]
            
        for string in strs:
            m = min(len(string), len(lcp))
            lcp = lcp[:m]
            for i in range(m):
                if lcp[i]!=string[i]:
                    lcp = lcp[:i]
                    break
        
        return lcp       