#include <stdio.h>
// #include <stdbool.h>
int singleNumber(int* nums, int numsSize) {
    int ret = 0, i = 0;
    for(i = 0; i < numsSize;i++)
    {
        ret = ret ^ nums[i];
    }
    return ret;
}

int main()
{
    int nums[] = {4,1,2,1,2};
    int length = *(&nums + 1) - nums;
    printf("%d\n",singleNumber(nums,length));
    return 0;
}

//gcc -o singleNumber singleNumber.c
//./singleNumber