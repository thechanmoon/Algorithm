class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        ret = []
    
        for num in nums:    
            
            if nums[abs(num)-1] < 0:
                ret.append(abs(num))
            else:
                nums[abs(num)-1] = -nums[abs(num)-1]   

            # print(nums, ret)
        return ret
    
sl = Solution();
print(sl.findDuplicates([4,3,2,7,8,2,3,1]));    