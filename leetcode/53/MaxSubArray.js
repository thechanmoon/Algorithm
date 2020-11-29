var maxSubArray = function(nums) {
    let sum = nums[0];
    for (let i = 1; i < nums.length; i++) {
        if (nums[i - 1] > 0) {
            nums[i] += nums[i - 1];
        }
        sum = Math.max(nums[i], sum);
        // sum = nums[i] > sum ? nums[i] : sum
    }
    return sum;
};

console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]));