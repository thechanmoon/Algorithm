/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    hashmap = {};
    for(let i = 0; i < numbers.length; i++)
    {
        if(hashmap[target-numbers[i]] !== undefined)
            return [hashmap[(target - numbers[i])]+1,i+1];
        hashmap[numbers[i]] = i;
    }
    return null;
    
};

console.log(twoSum([2,7,11,15],9));
console.log(twoSum([2,3,4],6));
console.log(twoSum([-1,0],-1));