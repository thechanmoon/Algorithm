from re import S


class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        min_price = prices[0]
        profit = 0

        for price in prices:
            # min_price = min(min_price, price)
            # profit = max(profit, price-min_price)

            if min_price > price:
                min_price = price
            
            if profit < price-min_price:
                profit = price-min_price

        return profit

print(Solution().maxProfit([ 7,1,5,3,6,4]))