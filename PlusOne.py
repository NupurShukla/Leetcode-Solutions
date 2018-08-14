class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        carry = 0
        l = len(digits)
        num = digits[l-1] + 1
        if num >= 10:
            num = num%10
            carry = 1
        digits[l-1] = num
               
        for i in range(len(digits)-2, -1, -1):
            num = digits[i] + carry
            if num >= 10:
                num = num%10
                carry = 1
            else:
                carry = 0
            
            digits[i] = num
            
        if carry == 1:
            digits.insert(0, 1)
            
        return digits