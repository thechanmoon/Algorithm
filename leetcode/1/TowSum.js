var twoSum = function(nums, target) {
    hashmap = {};
    for(let i = 0; i < nums.length; i++)
    {
        if(hashmap[target-nums[i]] !== undefined)
            return [hashmap[(target - nums[i])],i];
        hashmap[nums[i]] = i;
    }
    return null;
};

console.log(twoSum([2,7,11,15],9));
console.log(twoSum([3,2,4],6));
console.log(twoSum([3,3],6));