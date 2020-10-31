var findDuplicates = function(nums) {
    let list = [];
    
    for(let i = 0; i < nums.length; i++)
    {                
        let index = Math.abs(nums[i])-1;
        if(nums[index] < 0)
        {
            list.push(index+1);
        }else
        {
            nums[index] = -nums[index];
        }
    }
    return list;
};

let arr = [ 4, 3, 2, 7, 8, 2, 3, 1 ];
let result = findDuplicates(arr);
console.log(result);