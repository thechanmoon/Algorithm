/**
 * @param {string} s
 * @return {number}
 */
var minDeletions = function(s) {
    
    let freq = [...new Array(26)].map(()=>0);
    
    let arr = s.split('');
    for(let i = 0; i < arr.length; i++)
    {
        freq[arr[i].charCodeAt() - 'a'.charCodeAt()]++;
    }
    
    // console.log(freq);
    freq.sort((a,b)=>a-b);
    // freq.sort();
    let exp = freq[25];
    let res = 0;
    
    for(let i = 25; i >-1; i--)
    {
        if( freq[i] == 0 )
            break;
        
        if(freq[i] > exp)
        {
            res += freq[i] - exp;
        }else
        {
            exp = freq[i];        
        }
        
        if(exp > 0)
            exp--;
    }
    return res;
};

console.log(minDeletions("aaabbbcc"));