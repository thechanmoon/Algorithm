class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index = 0
        for i in range(1, len(nums)):
            if nums[i-1] != nums[i]:
                index = index + 1
                nums[index] = nums[i]
        return index + 1


sl = Solution()
print(sl.removeDuplicates([0, 1, 1, 2]))
