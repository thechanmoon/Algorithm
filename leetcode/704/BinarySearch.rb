def search(nums, target)
    left = 0
    right = nums.size - 1
    while left <= right
        mid = left + (right-left)/2
        
        if nums[mid] == target
        return mid
        elsif nums[mid] > target
        right = mid - 1
        else
        left = mid + 1
        end
    end
return -1
end

def search1(nums, target)
    if nums.include?target
        return nums.index(target)
    end     
return -1
end    

puts(search([-1,0,3,5,9,12],9));
puts(search1([-1,0,3,5,9,12],9));