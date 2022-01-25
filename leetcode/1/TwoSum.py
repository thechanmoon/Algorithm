class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap = {}
        for i, value in enumerate(nums):
           
            if target - value in hashmap:
                return [hashmap[target - value], i]
            
            hashmap[value] = i 