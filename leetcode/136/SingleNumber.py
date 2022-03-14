# class Solution:
    # def singleNumber(self, nums: List[int]) -> int:
        
        # map = {}
        # for i in range(0,len(nums)):
        #     if nums[i] in map:
        #         map[nums[i]] = map[nums[i]] + 1;
        #     else:
        #         map[nums[i]] = 1;
        
        # for num in nums:
        #     if num in map:
        #         map[num] = map[num] + 1;
        #     else:
        #         map[num] = 1;
            
        # for value in map:
        #     if map[value] == 1:
        #         return value
        # return -1  

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = 0;
        for num in nums:
            a = a ^ num
        return a;

sl = Solution()
print(sl.singleNumber([2,1,2,3,1]))
  