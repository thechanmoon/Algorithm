var maximumWealth = function(accounts) {
    return Math.max(...accounts.map((cust)=>cust.reduce((acc,cur)=>acc+cur)));
    // return Math.max(...accounts.map((x) => { return x.reduce((a,b) => { return a + b} ) } ))
    // return accounts.reduce((accum, curr) => Math.max(accum, curr.reduce((a, b) => a + b)) , 0)
};

console.log(maximumWealth([[1,2,3],[3,2,1],[4,5,6]]
    ));