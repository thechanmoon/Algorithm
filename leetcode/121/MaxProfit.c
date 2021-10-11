#include <stdio.h>

#define MAX(x, y) (((x) > (y)) ? (x) : (y))
#define MIN(x, y) (((x) < (y)) ? (x) : (y))

// int maxProfit(int *prices, int pricesSize)
// {
//     if (pricesSize == 0)
//     {
//         return 0;
//     }
//     int min_price = prices[0];
//     int maxprofit = 0;
//     for (int i = 0; i < pricesSize; i++)
//     {
//         min_price = MIN(min_price, prices[i]);
//         maxprofit = MAX(maxprofit, prices[i] - min_price);
//     }

//     return maxprofit;
// }

int maxProfit(int* prices, int pricesSize){
    int min_price = INT_MAX;
    int max_profit = 0;

    for(int i = 0; i < pricesSize; i++){
        min_price = MIN(min_price, prices[i]);
        max_profit = MAX(max_profit, prices[i]-min_price);
    }

    return max_profit;
}

int main()
{
    int array[] = {7, 1, 5, 3, 6, 4};
    int length = sizeof(array) / sizeof(array[0]);
    int profit = maxProfit(array, length);
    printf("%d", profit);
}