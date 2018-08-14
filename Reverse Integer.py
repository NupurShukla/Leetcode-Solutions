class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x<0:
            sign = -1
        else:
            sign = 1
            
        maxint = 2**31 -1
        
        x = sign*x
        rev = 0
        while x > 0:
            d = x % 10
            rev = 10*rev + d
            x = int(x/10)
            
            if sign*rev > maxint or sign*rev < ((-1*maxint) - 1):
                return 0
        
        return sign*rev
        