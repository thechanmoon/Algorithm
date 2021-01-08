/**
 * @param {string} s
 * @return {number}
 */
var numSplits = function(s) {
    let left = [...new Array(26)].map(()=>0);
    let right = [...new Array(26)].map(()=>0);
    let distinct_left  = 0;
    let distinct_right  = 0;
    let retVal = 0;

    for(let i = 0; i < s.length; i++)
    { 
        distinct_right  += ++right[s[i].charCodeAt() - 'a'.charCodeAt()] == 1;       
    }

    for(let i = 0; i < s.length; i++)
    {
        distinct_left  += ++left[s[i].charCodeAt() - 'a'.charCodeAt()] == 1 ;
        distinct_right  -= --right[s[i].charCodeAt() - 'a'.charCodeAt()]== 0 ;
        retVal += distinct_left  == distinct_right;    

    }
    return retVal;
};
// // 88 ms
// const numSplits = (s) => {
//     let n = s.length;
//     let set = new Set();
//     let left = [0];
//     for (let i = 0; i < n; i++) {
//         set.add(s[i]);
//         left[i + 1] = set.size;
//     }
//     set.clear();
//     let right = [0];
//     for (let i = 0; i < n; i++) {
//         set.add(s[n - i - 1]);
//         right[i + 1] = set.size;
//     }
//     let res = 0;
//     for (let i = 1; i < n; i++) {
//         res += left[i] == right[n - i];
//     }
//     return res;
// };

// // 84ms
// const numSplits_zerotrac2 = (s) => {
//     let p = new Array(26).fill(0);
//     let tot = new Array(26).fill(0);
//     let l = 0;
//     let r = 0;
//     for (const ch of s) {
//         if (++tot[ch.charCodeAt() - 'a'.charCodeAt()] == 1) r++;
//     }
//     let res = 0;
//     for (const ch of s) {
//         if (++p[ch.charCodeAt() - 'a'.charCodeAt()] == 1) l++;
//         if (p[ch.charCodeAt() - 'a'.charCodeAt()] == tot[ch.charCodeAt() - 'a'.charCodeAt()]) r--;
//         if (l == r) res++;
//     }
//     return res;
// };