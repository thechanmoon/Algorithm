# class Solution(object):
#     def findDuplicates(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
        
#         ret = []
    
#         for num in nums:    
            
#             if nums[abs(num)-1] < 0:
#                 ret.append(abs(num))
#             else:
#                 nums[abs(num)-1] = -nums[abs(num)-1]   

#             # print(nums, ret)
#         return ret

from typing import List

class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        ret = []
        for n in nums:
            n = abs(n)
            if nums[n-1]< 0:
                ret.append(n)
            nums[n-1] = -nums[n-1]
        return ret     

sl = Solution();
print(sl.findDuplicates([4,3,2,7,8,2,3,1]));    