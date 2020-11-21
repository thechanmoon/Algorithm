public class Solution
{
    public int MaxProfit(int[] prices)
    {
        if (prices.Length == 0)
        {
            return 0;
        }
        int min_price = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.Length; i++)
        {
            min_price = Math.Min(min_price, prices[i]);
            maxprofit = Math.Max(maxprofit, prices[i] - min_price);
        }

        return maxprofit;
    }
}