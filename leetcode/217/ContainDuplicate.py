from typing import List
# class Solution(object):
#     def containsDuplicate(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: bool
#         """
#         hash = {}
#         for i, num in enumerate(nums):
#             if nums[i] in hash:
#                 return True
#             else:
#                 hash[nums[i]] = True
#         return False


# class Solution:
#     def containsDuplicate(self, nums: List[int]) -> bool:
#         hash = {}
#         for i, num in enumerate(nums):
#             if num in hash:
#                 return True
#             else:
#                 hash[num] = True
#         return False

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        return len(set(nums)) != len(nums)


sl = Solution()
print(sl.containsDuplicate([1, 2, 3, 1]))
