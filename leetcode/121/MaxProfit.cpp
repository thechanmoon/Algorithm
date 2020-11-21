// #include <bits/stdc++.h>
#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        if (prices.size() == 0)
        {
            return 0;
        }
        int min_price = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.size(); i++)
        {
            min_price = min(min_price, prices[i]);
            maxprofit = max(maxprofit, prices[i] - min_price);
        }

        return maxprofit;
    }
};

int main()
{
    Solution sl;
    vector<int> vect;

    vect.push_back(7);
    vect.push_back(1);
    vect.push_back(5);
    vect.push_back(3);
    vect.push_back(6);
    vect.push_back(4);

    cout << sl.maxProfit(vect);
}
//gcc -o MaxProfitCpp MaxProfit.cpp -lstdc++