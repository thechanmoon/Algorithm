/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let i = num1.length-1, j = num2.length-1, carry = 0;
    let ch_num1 = 0, ch_num2 = 0, sum = 0;
    let result = '';
    while(i>=0 || j>=0 || carry > 0)
    {
        ch_num1 = i >=0 ? num1[i--] - '0' : 0;
        ch_num2 = j >=0 ? num2[j--] - '0' : 0;
        sum = ch_num1 + ch_num2+carry;
        result = (sum %10) + result; 
        carry = Math.floor(sum /10);
    }
    return result;
};

console.log(addStrings("11","123"));