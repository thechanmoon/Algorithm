var findShortestSubArray = function(nums) {
    let obj = {}, max = 0, result = nums.length;
    for(let i = 0; i < nums.length; i++) {
        if(!obj[nums[i]]) {
            obj[nums[i]] = [i];
        } else {
            let t = obj[nums[i]];
            t.push(i);
            obj[nums[i]] = t;
        }
    }
    
    for (let [key, value] of Object.entries(obj)) {
        if(value.length === max) {
            result = Math.min(result, value[value.length - 1] - value[0] + 1);
        }
        if(value.length > max) {
            result = value[value.length - 1] - value[0] + 1;
            max = value.length;
        }
    }
    
    return result;
};