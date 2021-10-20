/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
        let firstBuy = Number.MAX_VALUE;
        let secondBuy = Number.MAX_VALUE;
        let firstSell = 0;
        let secondSell = 0;

        for(let i = 0; i < prices.length; i++)
        {
            firstBuy = Math.min(firstBuy,prices[i]);
            firstSell = Math.max(firstSell,prices[i] - firstBuy);
            secondBuy = Math.min(secondBuy,prices[i] - firstSell);
            secondSell = Math.max(secondSell, prices[i] - secondBuy);

            // console.log(firstBuy+","+firstSell+","+secondBuy+","+secondSell);
        } 
    // 
        return secondSell;
};

console.log(maxProfit([3, 3, 5, 0, 0, 3, 1, 4 ]));