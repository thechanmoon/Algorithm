class MaxProfit {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        // System.out.println(sl.maxProfit(new int[] { 7, 6, 5, 4, 3, 1 }));
    }
}

class Solution {

    // public int maxProfit(int[] prices) {
    // int i = 0, j = 0, retVal = 0, profit = 0;

    // for (i = 0; i < prices.length; i++) {
    // for (j = i + 1; j < prices.length; j++) {
    // profit = prices[j] - prices[i];
    // if (profit > 0 && profit > retVal) {
    // retVal = profit;
    // }
    // }
    // }

    // return retVal;
    // }

    // public int maxProfit(int[] prices) {
    // int maxProf = 0, j = 0;
    // for (int i = 1; i < prices.length; i++) {
    // int compare = prices[i] - prices[j];
    // if (compare > maxProf) {
    // maxProf = compare;
    // }
    // if (prices[i] < prices[j])
    // j = i;
    // }
    // return maxProf;
    // }

    // public int maxProfit(int[] prices) {
    // if (prices.length < 2) {
    // return 0;
    // }
    // int maxProfit = Integer.MIN_VALUE;
    // int minPrice = Integer.MAX_VALUE;
    // for (int price : prices) {
    // minPrice = Math.min(minPrice, price);
    // maxProfit = Math.max(maxProfit, price - minPrice);
    // }
    // return maxProfit;
    // }

    // public int maxProfit(int[] prices) {
    // int min = Integer.MAX_VALUE;
    // int retVal = 0;

    // for (int price : prices) {
    // if (price < min) {
    // min = price;
    // } else if (price - min > retVal) {
    // retVal = price - min;
    // }
    // }
    // return retVal;
    // }

    // public int maxProfit(int[] prices) {
    // if (prices.length == 0) {
    // return 0;
    // }
    // int min_price = prices[0];
    // int maxprofit = 0;
    // for (int i = 0; i < prices.length; i++) {
    // min_price = Math.min(min_price, prices[i]);
    // maxprofit = Math.max(maxprofit, prices[i] - min_price);
    // }

    // return maxprofit;
    // }

    // int min(int x, int y) {
    // return y ^ ((x ^ y) & -(x << y));
    // }

    // int max(int x, int y) {
    // return x ^ ((x ^ y) & -(x << y));
    // }
    // int min(int x, int y) {
    // return x < y ? x : y;
    // }

    // int max(int x, int y) {
    // return x > y ? x : y;
    // }

    // int CHAR_BIT = 4;
    // int INT_BIT = 8;

    // int min(int x, int y) {
    // return y + ((x - y) & ((x - y) >> (INT_BIT * CHAR_BIT - 1)));
    // }

    // int max(int x, int y) {
    // return x - ((x - y) & ((x - y) >> (INT_BIT * CHAR_BIT - 1)));
    // }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {

            // maxprofit = Math.max(maxprofit, prices[i] - min);
            // min = Math.min(min, prices[i]);
            // maxprofit = (maxprofit > prices[i]-min)? maxprofit : prices[i]-min;
            // min = (min < prices[i]) ? min : prices[i];
            min = Math.min(min, prices[i]);
            maxprofit = Math.max(maxprofit, (prices[i] - min));

        }

        return maxprofit;
    }
}