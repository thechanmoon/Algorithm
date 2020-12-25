let minDifference = (nums) => {
    if(nums.length <= 4) return 0;
    let min = Number.MAX_SAFE_INTEGER;
    
    nums.sort((a, b) => a - b);
    console.log(nums);
    for(let i = 0; i<=3; i++){
        console.log(nums.length-1-i,3-i);
        console.log(nums[nums.length-1-i],nums[3-i]);
        console.log('=========');
        min = Math.min(min,nums[nums.length-1-i] - nums[3-i]);
    }
    
    return min;
};

console.log(minDifference([1, 5, 0, 10, 14]));