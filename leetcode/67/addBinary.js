var addBinary = function(a, b) {
    let index_a = a.length-1,index_b = b.length-1, carry = 0, result= '', num1 = 0, num2 = 0, sum = 0;
    
    while(index_a>=0|| index_b>=0|| carry ===1)
    {
        num1 = index_a >=0 ? a[index_a--] - '0' : 0;
        num2 = index_b >=0 ? b[index_b--] - '0' : 0;
        
        
        sum = num1 + num2 + carry;
        result = ((sum)%2).toString() + result ;

        console.log(num1,num2,sum,carry,result);

        carry = Math.floor((sum)/2);
    }
    return result;
};

console.log(addBinary('1010','1011'));