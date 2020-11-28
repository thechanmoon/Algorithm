int *productExceptSelf(int *nums, int numsSize, int *returnSize)
{
    int left = 1;
    int right = 1;

    int *product = (int *)malloc(numsSize * sizeof(int));
    *returnSize = numsSize;

    for (int i = 0; i < numsSize; i++)
    {
        product[i] = left;
        left *= nums[i];
    }

    for (int i = numsSize - 1; i > -1; i--)
    {
        product[i] = right * product[i]; // left * right
        right *= nums[i];
    }
    return product;
}