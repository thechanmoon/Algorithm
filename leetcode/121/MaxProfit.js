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

// const CHAR_BIT = 4; 
// const INT_BIT = 8; 

// var min = function(x, y) {
//     return y + ((x - y) & ((x - y) >>  (INT_BIT * CHAR_BIT - 1)));
// }

// var max = function(x, y) {
//     return x - ((x - y) & ((x - y) >> (INT_BIT * CHAR_BIT - 1)));
// }

// var maxProfit = function(prices) {
//     if(prices.length==0) {
//         return 0;
//     }
//     let min_price=prices[0];
//     let maxprofit=0;
//     for(let i=0;i<prices.length;i++) {
//         // maxprofit = Math.max(maxprofit,prices[i]-min_price);
//         // min_price =  Math.min(min_price,prices[i]);
//         // maxprofit = (maxprofit > prices[i]-min_price)? maxprofit : prices[i]-min_price;
//         // min_price =  (min_price < prices[i]) ? min_price : prices[i];
//         min_price =  min(min_price,prices[i]);
//         maxprofit = max(maxprofit,prices[i]-min_price);
//     }
    
//     return maxprofit;        
// }

// var maxProfit = function(prices) {
//         let min = prices[0];
//         let max = 0;
        
//         for(let i = 1; i < prices.length; i++)
//         { 
//             // console.log("day " + (i+1));
//             // console.log("before");
//             // console.log("prices[i] = "+prices[i]);
//             // console.log("min = "+min);
//             // console.log("max = "+max);
            
//             // if(min>prices[i])
//             // {
//             //     min = prices[i];    
//             // }
//             // else
//             // {
//             //     if(prices[i] - min > max)
//             //         max = prices[i] - min;
//             // }
            
//             min = ( prices[i] < min ) ?  prices[i] : min;
//             max = ( prices[i] - min > max) ? prices[i] - min : max;
            
//             // console.log("after");
//             // console.log("min = "+min);
//             // console.log("max = "+max);
//             // console.log();
//         }
//         return max;
// };

/**
 * @param {number[]} prices
 * @return {number}
 */
// var maxProfit = function(prices) {
//         let min_price = Number.MAX_VALUE;
//         let max_profit = 0;
    
//         // console.log(min_price);
//         for(let i = 0; i < prices.length; i++){
//             min_price = Math.min(min_price, prices[i]);
//             max_profit = Math.max(max_profit, prices[i]-min_price);
//         }
        
//         return max_profit;
// };

/**
 * @param {number[]} prices
 * @return {number}
 */
// var maxProfit = function(prices) {
//     let minprice = Number.MAX_SAFE_INTEGER;
//     let maxprofit = 0;
//     let i = 0;
//     while(i < prices.length){
        
              
//         if(prices[i] < minprice )
//         {
//             minprice =  prices[i];
//         }
        
//         if(maxprofit < prices[i] - minprice)
//         {
//             maxprofit = prices[i] - minprice;
//         }
//         i++;
//     }
            
//     return maxprofit;    
// };

/**
 * @param {number[]} prices
 * @return {number}
 */
/**
 * @param {number[]} prices
 * @return {number}
 */
 var maxProfit = function(prices) {
    let minprice = Number.MAX_SAFE_INTEGER;
    let maxprofit = 0;
    
    for(let i = 0; i < prices.length; i++){  
        
//         let profit = prices[i] - minprice;
        
//         if( minprice > prices[i] )
//         {
//             minprice =  prices[i];
//         }
        
//         if( maxprofit < profit)
//         {
//             maxprofit = profit;
//         }
        
        minprice = Math.min(minprice,prices[i]);
        maxprofit = Math.max(maxprofit,prices[i]-minprice);

        // console.log(minprice,maxprofit);
    }
            
    return maxprofit;    
};

console.log(maxProfit([ 7, 3, 5, 1, 6, 4]));
// console.log(maxProfit([ 7, 6, 5, 4, 3, 1]));