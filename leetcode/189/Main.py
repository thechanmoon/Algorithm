# class Solution(object):
#     def rotate(self, nums, k):
#         """
#         :type nums: List[int]
#         :type k: int
#         :rtype: None Do not return anything, modify nums in-place instead.
#         """
#         k = k % len(nums)
        
#         temp = 0
#         left = 0
#         right = len(nums) -1
        
#         # print (nums)
        
#         while left < right:
#             temp = nums[left]
#             nums[left]= nums[right]
#             nums[right]= temp
#             left = left+1
#             right = right -1
            
#         # print (nums)    
        
#         left = 0
#         right = k-1
        
#         while left < right:
#             temp = nums[left]
#             nums[left]= nums[right]
#             nums[right]= temp
#             left = left+1
#             right = right -1
        
#         # print (nums)  
        
#         left = k
#         right = len(nums) -1
#         while left < right:
#             temp = nums[left]
#             nums[left]= nums[right]
#             nums[right]= temp
#             left = left+1
#             right = right -1
        
#         # print (nums)  

# class Solution(object):
#     def swap(self, array, i,j):
#         # print(array,i,j)
#         temp = array[i]
#         array[i] = array[j]
#         array[j] = temp


#     def rotate(self, nums, k):
#         """
#         :type nums: List[int]
#         :type k: int
#         :rtype: None Do not return anything, modify nums in-place instead.
#         """
#         k = k % len(nums)
        
#         temp = 0
#         left = 0
#         right = len(nums) -1
        
#         print (nums)
        
#         while left < right:
#             self.swap(nums,left,right)
#             left = left+1
#             right = right -1
            
#         print (nums)    
        
#         left = 0
#         right = k-1
        
#         while left < right:
#             self.swap(nums,left,right)
#             left = left+1
#             right = right -1
        
#         print (nums)  
        
#         left = k
#         right = len(nums) -1
#         while left < right:
#             self.swap(nums,left,right)
#             left = left+1
#             right = right -1
        
#         print (nums) 

class Solution(object):
    def swap(self, array, i,j):
        # print(array,i,j)
        temp = array[i]
        array[i] = array[j]
        array[j] = temp
            
    def reverse(self, array, left,right):
        while left < right:
            self.swap(array,left,right)
            left = left +1
            right = right -1    

    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        k = k % len(nums)
        self.reverse (nums,0,len(nums) -1)    
        self.reverse (nums,0,k -1)   
        self.reverse (nums,k,len(nums)-1)  

array = [1,2,3,4,5,6,7]
sl = Solution()
sl.rotate(array,3)  
print(array)    