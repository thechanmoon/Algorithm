/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0)
        return false
    
    let ch = x.toString().split('');
    // let mid = Math.floor(ch.length/2);
    let mid = parseInt(ch.length/2);
    

    for(let i = 0; i < mid; i++)
    {
        if((ch[i] !==ch[ch.length-1-i])==true)
        {
            return false;
        }
        return true;    
    }
};

/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0 || (x % 10 == 0 && x != 0))
        return false;
    
    let revertedNum = 0;
    
    while(x > revertedNum)
    {
        revertedNum = revertedNum*10 + x%10;
        x = Math.floor(x/10);
        // console.log("x = " + x);
        // console.log("revertedNum = " + revertedNum);
    }
    
    return (x == revertedNum || x == Math.floor(revertedNum/10));
    // if(x == revertedNum || x == Math.floor(revertedNum/10))
        // return true;
    
    // return false;
};

// console.log(isPalindrome(10));
console.log(isPalindrome(101));