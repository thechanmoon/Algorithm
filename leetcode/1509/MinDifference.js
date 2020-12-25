let minDifference = (nums) => {
    if(nums.length <= 4) return 0;
    let min = Number.MAX_SAFE_INTEGER;
    
    nums.sort((a, b) => a - b);
    for(let i = 0; i<=3; i++){
        min = Math.min(min,nums[nums.length-1-i] - nums[3-i]);
    }
    
    return min;
};