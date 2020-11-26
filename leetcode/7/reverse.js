var reverse = function(x) {
    let rev = 0;
    
    while(x!=0)
    {
        rev = rev *10 + x%10;
        x = parseInt(x/10);
    }

    // if(rev > Math.pow(2, 31) - 1|| rev < -Math.pow(2, 31))
    if(rev > (2**31) - 1 || rev < -(2**31))
        return 0;

    
        
    return rev;
}

// console.log(reverse(3165));
console.log(reverse(1534236469));