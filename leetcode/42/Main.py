class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left_index = 0; 
        right_index = len(height) -1;
        left_max = height[0];
        right_max = height[len(height)-1];
        ret = 0;
        
        while(left_index < right_index) :
            if(left_max < right_max):
                left_index += 1;
                left_max = max(left_max, height[left_index]);
                ret += left_max - height[left_index];
            else:
                right_index -= 1;
                right_max = max(right_max, height[right_index]);
                ret += right_max - height[right_index];
        
        return ret;        

sl = Solution();
print(sl.trap([0,1,0,2,1,0,1,3,2,1,2,1]));