function removeDuplicates(nums: number[]): number {
    if (nums.length == 0 || nums.length == 1)
        return nums.length;
    let index = 0;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i - 1] != nums[i])
            nums[++index] = nums[i];
    }
    return index + 1;
};