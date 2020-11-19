# @param {Integer[]} nums
# @return {Integer}
def remove_duplicates(nums)
    if (nums.length == 0 || nums.length == 1)
        return nums.length;
    end
    
    index = 0;
    1.step do |i| 
        if (nums[i-1] != nums[i])
            index = index +1;
            nums[index] = nums[i];
        end
        break if i>=nums.length-1 
    end
    return index + 1;
end