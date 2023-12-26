/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
    let sum = 0;

    for(let i = 0; i < columnTitle.length;i++)
    {
        sum = sum*26 + columnTitle.charCodeAt(i) -"A".charCodeAt(0)+1;
    }
    return sum
};

console.log(titleToNumber("A"));
console.log(titleToNumber("AB"));
console.log(titleToNumber("ZY"));