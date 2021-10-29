class MaxProfit {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(2, new int[] { 2, 4, 1 }));
        System.out.println(s.maxProfit(2, new int[] { 3, 2, 6, 5, 0, 3 }));
    }
}

class Solution {
    public int maxProfit(int k, int[] prices) {

        if (k == 0 || prices.length < 2)
            return 0;

        if (k > prices.length / 2) {
            int maxProfitII = 0;
            for (int i = 1; i < prices.length; ++i)
                if (prices[i] > prices[i - 1])
                    maxProfitII += prices[i] - prices[i - 1];
            return maxProfitII;
        }
        int[] buy = new int[k];
        int[] sell = new int[k];
        for (int i = 0; i < buy.length; i++)
            buy[i] = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++)
            for (int j = k - 1; j >= 0; j--) {
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
                if (j == 0)
                    buy[j] = Math.max(buy[j], -prices[i]);
                else
                    buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
            }
        return sell[k - 1];
    }
}
