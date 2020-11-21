class MaxProfit {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(sl.maxProfit(new int[] { 7, 6, 5, 4, 3, 1 }));
    }
}

class Solution {

    public int maxProfit(int[] prices) {
        int i = 0, j = 0, retVal = 0, profit = 0;

        for (i = 0; i < prices.length; i++) {
            for (j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if (profit > 0 && profit > retVal) {
                    retVal = profit;
                }
            }
        }

        return retVal;
    }

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
}