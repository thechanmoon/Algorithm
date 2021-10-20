#include <iostream>
#include <vector>
#include <climits>
using namespace std;
class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int firstBuy = INT_MAX;
        int secondBuy = INT_MAX;
        int firstSell = 0;
        int secondSell = 0;

        for (int i = 0; i < prices.size(); i++)
        {
            firstBuy = min(firstBuy, prices[i]);
            firstSell = max(firstSell, prices[i] - firstBuy);
            secondBuy = min(secondBuy, prices[i] - firstSell);
            secondSell = max(secondSell, prices[i] - secondBuy);

            // cout << (" " + firstBuy+","+firstSell+","+secondBuy+","+secondSell);
        }
        //
        return secondSell;
    }
};

int main()
{
    Solution sl;
    vector<int> vect = {3, 3, 5, 0, 0, 3, 1, 4};
    // vect.push_back(7);
    // vect.push_back(1);
    // vect.push_back(5);
    // vect.push_back(3);
    // vect.push_back(6);
    // vect.push_back(4);

    cout << sl.maxProfit(vect) << "\n";
}

//gcc -o MaxProfitCpp MaxProfit.cpp -lstdc++