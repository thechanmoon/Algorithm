public class Solution
{
    public int MaxProfit(int[] prices)
    {
        if (prices.Length < 2)
            return 0;

        int profit = 0;

        for (int i = 0; i < prices.Length - 1; i++)
        {
            if (prices[i + 1] > prices[i])
            {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}