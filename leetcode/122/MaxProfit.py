class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profit = 0
        for i in range(1,len(prices)):
            if prices[i-1] < prices[i]:
                profit = profit + prices[i] - prices[i-1]
        return profit

sl = Solution();
print(sl.maxProfit([7, 1, 5, 3, 6, 4 ]));        
