var twoSum = function(nums, target) {
    let hashmap = {};
    for(let i = 0; i < nums.length; i++)
    {
        // if(hashmap[target-nums[i]] !== undefined)
        if(target-nums[i] in hashmap)
            return [hashmap[(target - nums[i])],i];
        hashmap[nums[i]] = i;
    }
    return [];
};

const twoSum1 = (numbers, sum) => {
    const dataObject = {}
    for(let i =0; i< numbers.length; i++){
        if(dataObject[sum - numbers[i]] != null){ // 9 & 1
            return [dataObject[(sum - numbers[i])],i];
        }
        dataObject[numbers[i]] = i // 1: 1 
    }
}

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


var twoSum3 = function(nums, target) {
    let map = new Map();
    
    for(let i = 0; i < nums.length; i++)
    {
        if(map.has(target-nums[i]))
            return [map.get(target-nums[i]),i];
        map.set(nums[i],i);
    }
        
    return [];
};

console.log(twoSum([2,7,11,15],9));
console.log(twoSum([3,2,4],6));
console.log(twoSum([3,3],6));
console.log();
console.log(twoSum1([2,7,11,15],9));
console.log(twoSum1([3,2,4],6));
console.log(twoSum1([3,3],6));
console.log();
console.log(twoSum2([2,7,11,15],9));
console.log(twoSum2([3,2,4],6));
console.log(twoSum2([3,3],6));
console.log();
console.log(twoSum3([2,7,11,15],9));
console.log(twoSum3([3,2,4],6));
console.log(twoSum3([3,3],6));