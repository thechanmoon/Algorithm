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

            // console.log(firstBuy+","+prices[i]);
            // console.log(firstSell+","+(prices[i] - firstBuy));
            // console.log(secondBuy+","+(prices[i] - firstSell));
            // console.log(secondSell+","+(prices[i] - secondBuy));

            // console.log("prices["+i+"]," + "firstBuy"+","+"firstSell"+","+"secondBuy"+","+"secondSell");
            // console.log(prices[i] +"         " + firstBuy+",        "+firstSell+",       "+secondBuy+",        "+secondSell);

            // console.log("====================================");
        } 
    // 
        return secondSell;
};

var maxProfit1 = function(prices) {
        let firstBuy = -Number.MAX_VALUE;
        let secondBuy = -Number.MAX_VALUE;
        let firstSell = 0;
        let secondSell = 0;

        for(let i = 0; i < prices.length; i++)
        {
            firstBuy = Math.max(firstBuy, -prices[i]);
            firstSell = Math.max(firstSell, firstBuy + prices[i]) ;
            secondBuy = Math.max(secondBuy, firstSell - prices[i]);
            secondSell = Math.max(secondSell, secondBuy + prices[i]);

            // console.log(firstBuy+","+prices[i]);
            // console.log(firstSell+","+(prices[i] - firstBuy));
            // console.log(secondBuy+","+(prices[i] - firstSell));
            // console.log(secondSell+","+(prices[i] - secondBuy));

            // console.log("prices["+i+"]," + "firstBuy"+","+"firstSell"+","+"secondBuy"+","+"secondSell");
            // console.log(prices[i] +"         " + firstBuy+",        "+firstSell+",       "+secondBuy+",        "+secondSell);
            console.log(firstBuy +"," + firstSell+","+secondBuy+","+secondSell);
            // console.log("====================================");
        } 
    // 
        return Math.max(secondSell);
};

var maxProfit2 = function(prices) {
        // let fb = Number.NEGATIVE_INFINITY;
        // let sb = Number.NEGATIVE_INFINITY;
        let fb = -Number.MAX_VALUE;
        let sb = -Number.MAX_VALUE;
        let fs = 0;
        let ss = 0;


        console.log("Number.MIN_VALUE : " + Number.NEGATIVE_INFINITY);

        for(let i = 0; i < prices.length; i++)
        {
            fb = Math.max(fb, -prices[i]);
            fs = Math.max(fs, fb + prices[i]) ;
            sb = Math.max(sb, fs - prices[i]);
            ss = Math.max(ss, sb + prices[i]);
            console.log(fb +"," + fs+","+sb+","+ss);
        } 
    // 
        return ss;
};


console.log(maxProfit1([3, 3, 5, 0, 0, 3, 1, 4 ]));
console.log(maxProfit2([3, 3, 5, 0, 0, 3, 1, 4 ]));
/*
prices[0],firstBuy,firstSell,secondBuy,secondSell
3         3,        0,       3,        0
====================================
prices[1],firstBuy,firstSell,secondBuy,secondSell
3         3,        0,       3,        0
====================================
prices[2],firstBuy,firstSell,secondBuy,secondSell
5         3,        2,       3,        2
====================================
prices[3],firstBuy,firstSell,secondBuy,secondSell
0         0,        2,       -2,        2
====================================
prices[4],firstBuy,firstSell,secondBuy,secondSell
0         0,        2,       -2,        2
====================================
prices[5],firstBuy,firstSell,secondBuy,secondSell
3         0,        3,       -2,        5
====================================
prices[6],firstBuy,firstSell,secondBuy,secondSell
1         0,        3,       -2,        5
====================================
prices[7],firstBuy,firstSell,secondBuy,secondSell
4         0,        4,       -2,        6
====================================
*/