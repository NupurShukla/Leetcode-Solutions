class Solution:
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ans = list()
        for i in range(n):
            x = i+1
            if x%15 == 0:
                ans.append("FizzBuzz")
            elif x%3 == 0:
                ans.append("Fizz")
            elif x%5 == 0:
                ans.append("Buzz")
            else:
                ans.append(str(x))
        return ans