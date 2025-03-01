var productExceptSelf = function(nums) {
    let left = 1;
    let right = 1;
    //let product = [];
    let product = new Array(nums.length).fill(1);
    
    // left side
    // [1,1,1*2,1*2*3]
    //product[0] => 1
    //product[1] => 1
    //product[2] => 1*2
    //product[3] => 1*2*3

    for(let i = 0; i < nums.length; i++)
    {
        product[i] = left;
        left *= nums[i]; 
    }
    
    //right side
    //[2*3*4, 3*4, 4, 1]
    //right3 = 1
    //right2 = 4
    //right1 = 3*4
    //right0 = 2*3*4

    //product[3] = right3*product[3] 
    //product[2] = right2*product[2]
    //product[1] = right1*product[1]
    //product[0] = right0*product[0]
    for(let i = nums.length -1; i > -1; i--)
    {
        product[i] = product[i] *right;  // left * right
        right *= nums[i];             
    }
    return product;
};

console.log(productExceptSelf([1,2,3,4]));