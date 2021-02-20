/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    // let result = [];
    // result[0] = findFirst(nums,target);
    // result[1] = findLast(nums,target);
    // return result;
    return [findFirst(nums,target),findLast(nums,target)];
    
};

var findFirst = function(nums, target) {
    let index = -1;

    let start = 0;
    let end = nums.length - 1;
    
    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        if (nums[mid] >= target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        if (nums[mid] == target)
            index = mid;
    }
    
    return index;
};

var findLast = function(nums, target) {
    let index = -1;

    let start = 0;
    let end = nums.length - 1;

    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        if (nums[mid] <= target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        if (nums[mid] == target)
            index = mid;
    }

    return index;
};