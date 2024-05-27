# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
    ret = 0;
    nums.each{ |num|
        ret = ret ^ num
    }
    ret;
end

def single_number1(nums)
    ret = 0
    nums.each_with_index{ |num,i|
        ret = ret ^ nums[i]
    }
    ret
end

# puts(single_number([4,2,1,1,2]));
puts(single_number1([4,2,1,1,2]));