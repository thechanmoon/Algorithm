/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring0 = function(s) {
    let i = 0; 
    let j = 0;
    let max = 0;
    let set = new Set();
    while (i < s.length)
    {
        
        if(!set.has(s.charAt(i)))
        {
            // console.log(i,s.charAt(i),set.has(s.charAt(i)));
           set.add(s.charAt(i++));
           max = Math.max(max,set.size);     
        }
        else
        {
            // console.log(i,s.charAt(i),set.has(s.charAt(i)));
            set.delete(s.charAt(j++));
        }
    }
    return max;
};

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

console.log(lengthOfLongestSubstring0("abcabcbb"));
console.log(lengthOfLongestSubstring("abcabcbb"));