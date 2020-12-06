/**
 * @param {number[]} nums
 * @param {number} S
 * @return {number}
 */
// O(2^n)
// var findTargetSumWays = function(nums, S) {
//     let total = 0;

//     function find(index, t) {
//         if (index >= nums.length) {
//             if (t === S) total++;
//             return;
//         }

//         find(index + 1, t - nums[index]);
//         find(index + 1, t + nums[index]);
//     }

//     find(0, 0);

//     return total;
// };


/**
 * @param {number[]} nums
 * @param {number} S
 * @return {number}
 */
var findTargetSumWays = function(nums, S) {
    let count = 0;
    
    function calculate(i, sum) {
        if (i >= nums.length) {
            if (sum === S)
                count++;
        }else
        {
            calculate(i + 1, sum +nums[i]);
            calculate(i + 1, sum -nums[i]);
        }
        
    }
    
    calculate(0, 0);
    return count;
    
};

console.log(findTargetSumWays([1,1,1,1,1],3));