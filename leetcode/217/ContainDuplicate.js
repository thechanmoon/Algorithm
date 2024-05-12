// var containsDuplicate = function(nums) {

//     let set = new Set();

//     for(let i = 0; i < nums.length; i++)
//     {
//         if(set.has(nums[i]))
//             return true;
//         else
//             set.add(nums[i]);
//     }
//     return false;
// };

// var containsDuplicate = function (nums) {
//     let set = new Set();
//     let ret = false;
//     for (let i = 0; i < nums.length; i++) {
//         if (set.has(nums[i])) {
//             ret = true;
//             break;
//         } else set.add(nums[i]);
//     }
//     return ret;
// };

var containsDuplicate = function (nums) {
    let set = new Set();
    let ret = false;
    console.log(nums);
    for (let num of nums) {
        console.log(num, set);
        if (set.has(num)) {
            ret = true;
            break;
        } else set.add(num);
    }
    return ret;
};

//for of, in loop test
// var forloop = (numbers) => {
//     for (let x of numbers) {
//         console.log(x);
//     }

//     let txt = "";
//     for (let x in numbers) {
//         txt += numbers[x] + ",";
//     }
//     console.log(txt);
// };
// forloop([1, 2, 3, 1]);

console.log(containsDuplicate([1, 2, 3, 1]));
