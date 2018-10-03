class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic = {'I':1,'V':5,'X':10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        prefixes = ['IV', 'IX', 'XL', 'XC', 'CD', 'CM']
        
        num=0
        i=0
        while i<len(s):
            if s[i:i+2] in prefixes:
                num += (dic[s[i+1]] - dic[s[i]])
                i+=2
            else:
                num += dic[s[i]]
                i+=1
        
        return num
            
                
        