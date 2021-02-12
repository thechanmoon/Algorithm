/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let i = 0;
    let j = 0;
    let max = 0;

    let hashset = new Set();

    for (j = 0; j < s.length;) {
        if (!hashset.has(s[j]))
        {
            hashset.add(s[j++]);
            max = Math.max(hashset.size, max);
        }
        else
        {
            hashset.delete(s[i++]);
        }
    }
    return max;
};