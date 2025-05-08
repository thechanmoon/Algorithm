class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left = 1;
        right = 1;
        length = len(nums);
        power = [1]*length;
        for index in range(length):
            power[index] = left;
            left = left*nums[index];
        # print(power);    
        for index in range(length-1,-1,-1):
            # print(index)
            power[index] = power[index]*right;
            # print(power[index]);
            # print(left);
            # print(right);
            # print('====');
            right = right*nums[index];    
        # print(power);
        return power;

sl = Solution();
print(sl.productExceptSelf([1,2,3,4]));
