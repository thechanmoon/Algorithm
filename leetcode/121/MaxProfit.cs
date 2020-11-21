public class Solution
{
    public int MaxProfit(int[] prices)
    {
        if (prices.Length == 0)
        {
            return 0;
        }
        int min = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.Length; i++)
        {
            maxprofit = Math.Max(maxprofit, prices[i] - min);
            min = Math.Min(min, prices[i]);
        }

        return maxprofit;
    }
}