var maxProfit = function(prices) {
    let i = 0, j = 0, retVal = 0, profit = 0;

    for(i = 0; i < prices.length; i++)
    {
        for(j = i+1; j < prices.length; j++)
        {
            profit = prices[j]- prices[i];
            if(profit > 0 && profit > retVal)
            {
                retVal = profit;
            }
        }
    }

    return retVal;
};

// var maxProfit = function(prices) {
//     let result = 0;
//     let min = prices[0];
//     for(let i = 1; i < prices.length; i++) {
//         min = Math.min(prices[i], min);
//         result = Math.max(result, prices[i] - min);
//     }
//     return result;
// };

// var maxProfit = function(prices) {
//     let minBuyPrice = Infinity;
//     let maxProfit = 0;

//     for(let price of prices)
//     {
//         if(price< minBuyPrice){
//             minBuyPrice = price;
//         }else if(price - minBuyPrice > maxProfit){
//             maxProfit = price - minBuyPrice;
//         }
//     }

//     return maxProfit;
// };

// var maxProfit = function(prices) {
//     let minBuyPrice = Infinity;
//     let maxProfit = 0;

//     prices.forEach(price=>
//     {
//         if(price< minBuyPrice){
//             minBuyPrice = price;
//         }else if(price - minBuyPrice > maxProfit){
//             maxProfit = price - minBuyPrice;
//         }
//     });
//     return maxProfit;
// };


console.log(maxProfit([ 7, 1, 5, 3, 6, 4]));