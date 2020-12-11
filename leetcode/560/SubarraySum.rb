# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}

def subarray_sum(nums, k)

    hash = Hash.new(0)
    hash[0] = 1
    count = sum = 0
    nums.each do |num|
        sum += num
        count += hash[sum - k]
        hash[sum] += 1
    end
    
    count
end

puts subarray_sum([1,1,1],2)
# def subarray_sum(nums, k)
    #     count = 0;
    #     sum = 0;
    #     hash = {};
        
    #     for i in (0..nums.length-1)
        
    #         sum+=nums[i];
            
    #         if(sum===k)
    #             count = count +1;
    #         end
            
    #         if(hash[sum-k] !=nil)
    #             count += hash[sum-k];     
    #         end
            
    #         if(hash[sum] == nil)      
    #            hash[sum] = 1;     
    #         else
    #            hash[sum] = hash[sum] +1;         
    #         end
    #     end    
    #     return count;
# end