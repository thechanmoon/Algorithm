int subarraySum(int *nums, int numsSize, int k)
{
    int d[numsSize + 1];
    d[0] = 0;
    for (int i = 1; i < numsSize + 1; i++)
    {
        d[i] = d[i - 1] + nums[i - 1];
    }
    int count = 0;

    for (int l = 0; l < numsSize + 1; l++)
    {

        for (int r = l + 1; r < numsSize + 1; r++)
        {
            if (d[r] - d[l] == k)
            {
                ++count;
            }
        }
    }
    return count;
}