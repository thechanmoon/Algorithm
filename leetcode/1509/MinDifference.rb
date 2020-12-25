# @param {Integer[]} nums
# @return {Integer}
def min_difference(nums)
    return 0 if nums.length<=4
    nums.sort!
    diff = nums[-4]-nums[0]
    for i in 1..3
        diff = nums[-4+i]-nums[i] if nums[-4+i]-nums[i] < diff
    end
    diff
end