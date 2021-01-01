int maxProfit(int* prices, int pricesSize){
    if(pricesSize == 0)
        return 0;

    int profit = 0;

    for(int i = 0; i < pricesSize -1; i++)
    {
        if(prices[i+1] > prices[i])
        {
            profit += prices[i+1] - prices[i];
        }
    }

    return profit;
}