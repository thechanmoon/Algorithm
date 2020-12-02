var removeElement = function(nums, val) {
    
    let index = 0;
    for(let i = 0; i < nums.length; i ++)
    {
    //    console.log("0 : "+i);
       console.log("a. i : "+i);
       console.log("b. nums[i]"+nums[i]);
        if(nums[i]!==val)
        {
            nums[index++] = nums[i];
            console.log("c. nums[i]"+nums[i]);

        }
    }
    console.log(nums);
    return index;

};

// const removeElement = (numbers, element) => {
//     // return numbers.filter(num => num !== element).length // creates new array
//     for(let i = 0; i< numbers.length; i++){ 
//         if(numbers[i] === element){
//             numbers.splice(i,1) // splice will change the index of elements to the left
//             i-- // so  two consecutive matching elements can get deleted
//         }
//     }
//     return numbers
// }

console.log(removeElement([3,2,2,3],2))

// console.log(removeElement([3,2,2,3]));
console.log(removeElement([2],3));