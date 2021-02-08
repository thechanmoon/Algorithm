var twoSum = function(nums, target) {
    let hashmap = {};
    for(let i = 0; i < nums.length; i++)
    {
        if(hashmap[target-nums[i]] !== undefined)
            return [hashmap[(target - nums[i])],i];
        hashmap[nums[i]] = i;
    }
    return null;
};
const twoSum2 = (numbers, sum) => {
    const dataObject = {}
    for(let i =0; i< numbers.length; i++){
        if(dataObject[sum - numbers[i]] !== undefined){ // 9 & 1
            return [dataObject[(sum - numbers[i])],i];
        }
        dataObject[numbers[i]] = i // 1: 1 
    }

    // for(let i =0; i< numbers.length; i++){
    //     const otherAdd = sum - numbers[i] // 10 - 1 = 9  | i = 0
    //     if(dataObject[otherAdd]){ // 9 & 1
    //         return [i,dataObject[(sum - numbers[i])]];
    //     }
    // }

    // const dataObject = {}
    // for(let i =0; i< numbers.length; i++){
    //     dataObject[numbers[i]] = i // 1: 1 
    // }
    // for(let i =0; i< numbers.length; i++){
    //     const otherAdd = sum - numbers[i] // 10 - 1 = 9  | i = 0
    //     if(dataObject[otherAdd]){ // 9 & 1
    //         return [i,dataObject[(sum - numbers[i])]];
    //     }
    // }


}

console.log(twoSum([2,7,11,15],9));
console.log(twoSum([3,2,4],6));
console.log(twoSum([3,3],6));

console.log(twoSum2([2,7,11,15],9));
console.log(twoSum2([3,2,4],6));
console.log(twoSum2([3,3],6));