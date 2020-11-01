# @param {Integer[]} nums
# @return {Integer[]}
def find_duplicates(nums)
    list = [];                  
    # nums.each.with_index do |num, i|               
    nums.each_with_index do |num, i|               
        index = num.abs()-1;
        if nums[index]  < 0
            list.push(num.abs);
        else
            nums[index] = -nums[index];
        end
    end
    list;
end

puts find_duplicates([4,3,2,7,8,2,3,1])

print find_duplicates([4,3,2,7,8,2,3,1])

puts