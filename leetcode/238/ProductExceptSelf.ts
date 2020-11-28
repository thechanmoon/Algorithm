function productExceptSelf(nums: number[]): number[] {
    let left: number = 1;
    let right: number = 1;
    let product: number[] = [];
    
    for(let i: number = 0; i < nums.length; i++)
    {
        product[i] = left;
        left *= nums[i]; 
    }
    
    for(let i: number = nums.length -1; i > -1; i--)
    {
        product[i] = right*product[i];  // left * right
        right *= nums[i];             
    }
    return product;
};