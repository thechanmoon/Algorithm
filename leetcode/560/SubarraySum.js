// var subarraySum = function(nums, k) {
//     let i = 0;
//     for (let a = 0; a < nums.length; a++) {
//     	if (parseInt(nums[a]) === k) i++;
//     }
//     while (nums.length > 0) {
//         nums.reduce((accu, curr, index) => {
//             if (accu + curr === k) i++;
//             return accu + curr;
//         });
//         nums.shift();
//     }
//     return i;
// };

var subarraySum = function(nums, k) {
    let count = 0;
    let sum = 0;
    let hash = {};
    
    for(let i = 0; i < nums.length; i++)
    {
        sum+=nums[i];
        
        if(sum===k)
            count++;
        
        if(hash[sum-k] !==undefined)
        {
            count += hash[sum-k];     
        }
        
        if(hash[sum] === undefined)
        {
           hash[sum] = 1;     
        }else
        {
           hash[sum]++;         
        }  
    }
    return count;
};