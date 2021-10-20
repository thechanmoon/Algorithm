#include <limits.h>
#include <stdio.h>
#define MAX(x, y) (((x) > (y)) ? (x) : (y))
#define MIN(x, y) (((x) < (y)) ? (x) : (y))

int maxProfit(int *prices, int pricesSize)
{
    int firstBuy = INT_MAX;
    int secondBuy = INT_MAX;
    int firstSell = 0;
    int secondSell = 0;

    for (int i = 0; i < pricesSize; i++)
    {
        firstBuy = MIN(firstBuy, prices[i]);
        firstSell = MAX(firstSell, prices[i] - firstBuy);
        secondBuy = MIN(secondBuy, prices[i] - firstSell);
        secondSell = MAX(secondSell, prices[i] - secondBuy);

        // cout << (" " + firstBuy+","+firstSell+","+secondBuy+","+secondSell);
    }
    //
    return secondSell;
}

int main()
{
    int array[] = {3, 3, 5, 0, 0, 3, 1, 4};
    int length = sizeof(array) / sizeof(array[0]);
    int profit = maxProfit(array, length);
    printf("%d\n", profit);
}