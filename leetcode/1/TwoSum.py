class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap = {}
        for i, value in enumerate(nums):
           
            if target - nums[i] in hashmap:
                return [i, hashmap[target - nums[i]]]
            
            hashmap[value] = i 