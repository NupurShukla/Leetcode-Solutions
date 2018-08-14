class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        l = len(needle)
        if l == 0:
            return 0
        
        h = len(haystack)
        if l > h:
            return -1
        
        for i in range(h-l+1):
            h = haystack[i:i+l]
            if h == needle:
                return i
            
        return -1
        