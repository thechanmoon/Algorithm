/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    // Option 
    if(x < 0)
        return false
    
    let ch = x.toString().split('');
    let mid = parseInt(ch.length/2);
    console.log(mid,ch.length/2);
    for(let i = 0; i < mid; i++)
    {
        console.log(ch[i],[ch.length - 1 - i]);
        if(ch[i] !==ch[x.length-1-i])
            return false;
    }
    return true;    
};

console.log(isPalindrome(10));