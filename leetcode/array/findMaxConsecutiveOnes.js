/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let max = 0;
    let count = 0;
    
    // if(nums.length === 0 || nums.length === 1)
    //     return 0;
    
    for(let i = 0; i < nums.length; i ++)
    {
        if(nums[i] === 1)
        {
            count++;
        }else
        {
            count = 0;
        }

        // console.log(count,max);

        if(count>max)
        {
            max = count;
        }
    }
    return max;
};
console.log(findMaxConsecutiveOnes([0,1]));