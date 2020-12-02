// var removeDuplicates = function(nums) {
//     if (nums.length == 0 || nums.length == 1)
//         return nums.length;
//     let index = 0;
//     for (let i = 1; i < nums.length; i++) {
//         if (nums[i - 1] != nums[i])
//             nums[++index] = nums[i];
//         console.log(nums);    
//     }
//     return index + 1;
// };

/* 
i = 1 , index 0 -> 0 , nums[ 0, 0, 1, 2 ] -> nums[ 0, 0, 1, 2 ]
i = 2 , index 0 -> 1 , nums[ 0, 0, 1, 2 ] -> nums[ 0, 1, 1, 2 ]
i = 3 , index 0 -> 2 , nums[ 0, 1, 1, 2 ] -> nums[ 0, 1, 2, 2 ]
 */

 /* 
i = 1 , index 0 -> 1 , nums[ 0, 1, 1, 2 ] -> nums[ 0, 1, 1, 2 ]
i = 2 , index 1 -> 1 , nums[ 0, 1, 1, 2 ] -> nums[ 0, 1, 1, 2 ]
i = 3 , index 1 -> 2 , nums[ 0, 1, 1, 2 ] -> nums[ 0, 1, 2, 2 ]
 */
// console.log(removeDuplicates([0, 0, 1, 2]));
console.log(removeDuplicates([0, 1, 1, 2]));