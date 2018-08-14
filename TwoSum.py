class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        length = len(nums)
        sumDict = dict()
        indices = list()
        
        for i in range(length):
            sumDict[nums[i]] = i
            
        for i in range(length):
            
            if (target-nums[i]) in sumDict:
                index1 = sumDict[target-nums[i]]
                index2 = i
                if index1 != index2:
                    break
                  
        if index1 < index2:
            indices.append(index1)
            indices.append(index2)
        else:
            indices.append(index2)
            indices.append(index1)
        
        return indices