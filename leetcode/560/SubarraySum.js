var subarraySum = function(nums, k) {
    let i = 0;
    for (let a = 0; a < nums.length; a++) {
    	if (parseInt(nums[a]) === k) i++;
    }
    while (nums.length > 0) {
        nums.reduce((accu, curr, index) => {
            if (accu + curr === k) i++;
            return accu + curr;
        });
        nums.shift();
    }
    return i;
};