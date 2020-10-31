int *findDuplicates(int *nums, int numsSize, int *returnSize)
{
    int *list = (int *)malloc(numsSize * sizeof(int));
    int list_idx = 0;

    for (int i = 0; i < numsSize; i++)
    {
        int index = abs(nums[i]) - 1;
        if (nums[index] < 0)
        {
            list[list_idx++] = abs(nums[i]);
        }
        else
        {
            nums[index] = -nums[index];
        }
    }
    *returnSize = list_idx;
    return list;
}