# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    hashmap = {}

    # array.each_with_index {|val, index| puts "#{val} => #{index}" }
    nums.each_with_index { |value, index|           
        if hashmap.key?(target - value)
            return hashmap[target - value], index
        end
        hashmap[value] = index 
    }
end
puts(two_sum([2,7,11,15],9));