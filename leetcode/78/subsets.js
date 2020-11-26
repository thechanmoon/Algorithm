/**
 * @param {number[]} nums
 * @return {number[][]}
 */
// var subsets = function(nums) {
//     let sets = [];
// 	const dfs = (index, path) => {
// 		if(index === nums.length) {
// 			sets.push(path)
// 			return;
// 		}
// 	    dfs(index+1, [...path, nums[index]])
// 	    dfs(index+1, [...path])
// 	}
// 	dfs(0, [])
// 	return sets;
// };

var subsets = function(nums){
    const result = [];

    const dfs = (temp, rest) => {
        result.push(temp);

        for(let i = 0; i < rest.length; i++)
        {
            console.log(i,rest,rest[i],rest.slice(i+1));
            dfs(temp.concat(rest[i]),rest.slice(i+1))
        }
    }
    dfs([],nums);
    return result;
}

console.log(subsets([1,2]));