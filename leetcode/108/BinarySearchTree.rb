# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val = 0, left = nil, right = nil)
#         @val = val
#         @left = left
#         @right = right
#     end
# end
# @param {Integer[]} nums
# @return {TreeNode}
def sorted_array_to_bst(nums)
    return nums if nums.empty?
    the_actual_function(nums, 0, nums.length-1)
end

def the_actual_function(nums, s, e)
    if s <= e
        mid = (s+e) / 2
        node = TreeNode.new(nums[mid])
        node.left = the_actual_function(nums, s, mid - 1)
        node.right = the_actual_function(nums, mid+1, e)
        node
    end
end