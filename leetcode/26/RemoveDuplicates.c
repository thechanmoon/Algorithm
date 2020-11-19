int removeDuplicates(int *nums, int numsSize)
{
    if (numsSize == 0 || numsSize == 1)
        return numsSize;
    int index = 0;
    for (int i = 1; i < numsSize; i++)
    {
        if (nums[i - 1] != nums[i])
            nums[++index] = nums[i];
    }
    return index + 1;
}