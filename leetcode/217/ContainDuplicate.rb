def contains_duplicate(nums)
    hash = {}
    
    nums.each do |x|
        if hash[x] == x
           return true 
        end    
        hash[x] = x;
    end
    
    false
end

puts contains_duplicate([1,2,3,1]);