import javax.sound.midi.Soundbank;

class MaxProfit {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         if (prices.length < 2)
//             return 0;

//         int profit = 0;

//         for (int i = 0; i < prices.length - 1; i++) {
//             if (prices[i + 1] > prices[i]) {
//                 profit += prices[i + 1] - prices[i];
//             }
//         }

//         return profit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length < 2)
            return 0;

        int profit = 0;
        int prev = prices[0];
        for (int price : prices) {
            if (price > prev) {
                profit += price - prev;
            }
            prev = price;
        }
        return profit;
    }
}