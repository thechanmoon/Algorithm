// var maxProfit = function(prices) {
//     let i = 0, j = 0, retVal = 0, profit = 0;

//     for(i = 0; i < prices.length; i++)
//     {
//         for(j = i+1; j < prices.length; j++)
//         {
//             profit = prices[j]- prices[i];
//             if(profit > 0 && profit > retVal)
//             {
//                 retVal = profit;
//             }
//         }
//     }

//     return retVal;
// };

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
// var min = function(x, y) {
//     return y ^ ((x ^ y) & -(x << y));
// }

// var max = function(x, y) {
//     return x ^ ((x ^ y) & -(x << y));
// }

// var min = function(x, y) {
//     return x < y? x : y;
// }

// var max = function(x, y) {
//     return x > y ? x : y;
// }

const CHAR_BIT = 4; 
const INT_BIT = 8; 

var min = function(x, y) {
    return y + ((x - y) & ((x - y) >>  (INT_BIT * CHAR_BIT - 1)));
}

var max = function(x, y) {
    return x - ((x - y) & ((x - y) >> (INT_BIT * CHAR_BIT - 1)));
}

var maxProfit = function(prices) {
    if(prices.length==0) {
        return 0;
    }
    let min_price=prices[0];
    let maxprofit=0;
    for(let i=0;i<prices.length;i++) {
        // maxprofit = Math.max(maxprofit,prices[i]-min_price);
        // min_price =  Math.min(min_price,prices[i]);
        // maxprofit = (maxprofit > prices[i]-min_price)? maxprofit : prices[i]-min_price;
        // min_price =  (min_price < prices[i]) ? min_price : prices[i];
        maxprofit = max(maxprofit,prices[i]-min_price);
        min_price =  min(min_price,prices[i]);
    }
    
    return maxprofit;        
}

console.log(maxProfit([ 7, 1, 5, 3, 6, 4]));
console.log(maxProfit([ 7, 6, 5, 4, 3, 1]));