# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    
    if x < 0 || ( x % 10 == 0 && x != 0)
       return false;
    end
    
    revertedNum = 0;
    
    while  x > revertedNum
        revertedNum = revertedNum *10 + x%10;
        x = x/10;
    end   
    
    return (x == revertedNum || x == (revertedNum /10));
    
end

puts is_palindrome(12321);
puts is_palindrome(10);