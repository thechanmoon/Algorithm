/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {

    const obj = {};
        
    for(let el of arr) {
        obj[el] = obj[el] ? ++obj[el] : 1;
    }
    const output = Object.values(obj);
    console.log([...obj.values()]);

    return output.length == new Set(output).size

}
console.log(uniqueOccurrences([1,2,2,1,1,3]));
// console.log(uniqueOccurrences([4,0,2,-5,-4]));