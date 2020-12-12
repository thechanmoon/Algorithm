function subarraySum(nums: number[], k: number): number {
    let count: number = 0;
    let sum: number  = 0;
    let hash = {};
    
    for(let i:number = 0; i < nums.length; i++)
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