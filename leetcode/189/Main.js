/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
// var rotate = function(nums, k) {    
//     k = k%nums.length;
//     reverse(nums,0, nums.length-1);
//     reverse(nums,0, k-1);
//     reverse(nums,k, nums.length-1);
// };

// var swap = function(nums, i, j){
//     let temp = nums[i];
//     nums[i] = nums[j];
//     nums[j] = temp;
// }

// var reverse = function(nums, left, right){
//     while(left < right){
//         swap(nums, left,right);
//         left = left +1;
//         right = right -1
//     }
// }

var rotate = function (nums, k) {
    const len = nums.length
    k = (k % len)
    
    let end = nums.splice(len - k)

    nums.splice(0,0,...end)
};
let nums = [1,2,3,4,5,6,7]
rotate(nums,3)
console.log(nums)