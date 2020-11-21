function maxProfit(prices: number[]): number {
    if(prices.length==0) {
        return 0;
    }
    let min_price: number = prices[0];
    let maxprofit: number = 0;
    for(let i: number=0;i<prices.length;i++) {
        min_price =  Math.min(min_price,prices[i]);
        maxprofit = Math.max(maxprofit,prices[i]-min_price);
    }
    
    return maxprofit;    
};