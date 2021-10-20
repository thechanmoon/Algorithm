public class Solution
{
    public int MaxProfit(int[] prices)
    {
        int firstBuy = int.MaxValue;
        int secondBuy = int.MaxValue;
        int firstSell = 0;
        int secondSell = 0;

        for (int i = 0; i < prices.Length; i++)
        {
            firstBuy = Math.Min(firstBuy, prices[i]);
            firstSell = Math.Max(firstSell, prices[i] - firstBuy);
            secondBuy = Math.Min(secondBuy, prices[i] - firstSell);
            secondSell = Math.Max(secondSell, prices[i] - secondBuy);

            // System.Console.WriteLine(firstBuy+","+firstSell+","+secondBuy+","+secondSell);
        }

        return secondSell;
    }
}