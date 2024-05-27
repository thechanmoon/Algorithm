/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let ret = 0;
    for (let num of nums){
        ret = ret ^ num;
    }
    return ret;
};

var singleNumber1 = function(nums) {
    let ret = 0;
    for (let i in nums){
        ret = ret ^ nums[i];
    }
    return ret;
};

var singleNumber2 = function(nums) {
  return nums.reduce((ret,num)=>ret^num,0);
};


console.log(singleNumber([4,1,2,1,2]));
console.log(singleNumber1([4,1,2,1,2]));
console.log(singleNumber2([4,1,2,1,2]));