/**
 * @param {string} sequence
 * @param {string} word
 * @return {number}
 */
var maxRepeating = function(sequence, word) {
    let count = 0;
    let str = word;
    while(sequence.indexOf(str)!=-1)
    {
        str += word;
        count++;
    }
    return count;
};