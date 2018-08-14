class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        check = list()
        for bracket in s:
            if bracket=='(' or bracket=='{' or bracket=='[':
                check.append(bracket)
            elif bracket==')' and (not check or check.pop()!='('):
                return False
            elif bracket=='}' and (not check or check.pop()!='{'):
                return False
            elif bracket==']' and (not check or check.pop()!='['):
                return False
            
        if check:
            return False
        return True    