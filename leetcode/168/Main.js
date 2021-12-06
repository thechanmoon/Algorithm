/**
 * @param {number} columnNumber
 * @return {string}
 */
var convertToTitle = function(columnNumber) {
    
    let title = "";
    
    while(columnNumber  > 0)
    {
        title = String.fromCharCode(--columnNumber%26 + 65) + title ;
        columnNumber = parseInt(columnNumber/26);
    }
    return title;
};

console.log(convertToTitle(0));
console.log(convertToTitle(1));
console.log(convertToTitle(26));
console.log(convertToTitle(27));
console.log(convertToTitle(28));