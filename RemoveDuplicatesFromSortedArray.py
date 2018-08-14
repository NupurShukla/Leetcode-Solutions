class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0 or len(nums) == 1:
	        return len(nums)
        
        i = 0
        for j in range(len(nums)):
	        if nums[i] != nums[j]:
		        nums[i+1] = nums[j]
		        i = i+1   
        return i+1