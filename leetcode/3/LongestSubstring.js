/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let i = 0;
    let j = 0;
    let max = 0;
    
    let hashset = new Set();
    
    while( i < s.length )
    {
        if(!hashset.has(s[i]))
        {
            hashset.add(s[i++]);
            max = Math.max(hashset.size, max);
        }else
        {
            hashset.delete(s[j++]);
        }
    }
    return max;
};

console.log(lengthOfLongestSubstring("abcabcbb"));