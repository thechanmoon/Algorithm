var findNumbers = function(nums) {
    let count = 0;
    for (let i = 0; i < nums.length; i++) {
        // if (isEvenNumberDigits(nums[i])) {
        if (nums[i].toString().length % 2 === 0) {
            count++;
        }
    }
    return count;
};

var isEvenNumberDigits = function(num) {
    let count = 0;
    while (num > 0) {
        num = Math.floor(num/10);
        count++;
       
    }
    return count % 2 == 0;

}

console.log(findNumbers([555,901,482,1771]));
// console.log(findNumbers([12,345,2,6,7896]));