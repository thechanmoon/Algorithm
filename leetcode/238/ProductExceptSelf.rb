def product_except_self(nums)
    left = 1;
    right = 1;
    product = [];
    
    puts product.length
    # for(let i = 0; i < nums.length; i++)
    for i in (0..nums.length - 1)
        product[i] = left;
        left = left*nums[i]; 
    end
    puts product
    # for(let i = nums.length -1; i > -1; i--)
    for i in ((nums.length - 1).downto(0))
    
        product[i] = right*product[i];
        right = right*nums[i];             
    end
    puts product
    product;
end

puts product_except_self([1,2,3,4]);