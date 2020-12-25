
#include <stdio.h>
#include <stdlib.h>

int cmpfunc(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

int minDifference(int *nums, int numsSize)
{
    if (numsSize <= 4)
        return 0;
    int min = INT_MAX;

    // sort(nums, numsSize);
    qsort(nums, numsSize, sizeof(int), cmpfunc);

    for (int i = 0; i <= 3; i++)
    {
        min = min < nums[numsSize - 1 - i] - nums[3 - i] ? min : nums[numsSize - 1 - i] - nums[3 - i];
    }

    return min;
}