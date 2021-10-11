// public class Solution
// {
//     public int MaxProfit(int[] prices)
//     {
//         if (prices.Length == 0)
//         {
//             return 0;
//         }
//         int min_price = prices[0];
//         int maxprofit = 0;
//         for (int i = 0; i < prices.Length; i++)
//         {
//             min_price = Math.Min(min_price, prices[i]);
//             maxprofit = Math.Max(maxprofit, prices[i] - min_price);
//         }

//         return maxprofit;
//     }
// }

public class Solution {
    public int MaxProfit(int[] prices) {
        int min_price = Int32.MaxValue;
        int max_profit = 0;
        
        for(int i = 0; i < prices.Length; i++){
            min_price = Math.Min(min_price, prices[i]);
            max_profit = Math.Max(max_profit, prices[i]-min_price);
        }
        
        return max_profit;
    }
}