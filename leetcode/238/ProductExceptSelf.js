var productExceptSelf = function(nums) {
    let left = 1;
    let right = 1;
    let product = [];
    
    for(let i = 0; i < nums.length; i++)
    {
        product[i] = left;
        left *= nums[i]; 
    }
    
    for(let i = nums.length -1; i > -1; i--)
    {
        product[i] = right*product[i];  // left * right
        right *= nums[i];             
    }
    return product;
};

console.log(productExceptSelf([1,2,3,4]));