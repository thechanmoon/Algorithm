#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        if (prices.size() == 0)
            return 0;

        int profit = 0;

        for (int i = 0; i < prices.size() - 1; i++)
        {
            if (prices[i + 1] > prices[i])
            {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
};

int main()
{
    Solution sl;
    vector<int> vect = {7,1,5,3,6,6};
    // vect.push_back(7);
    // vect.push_back(1);
    // vect.push_back(5);
    // vect.push_back(3);
    // vect.push_back(6);
    // vect.push_back(4);

    cout << sl.maxProfit(vect) << "\n";
}

//gcc -o MaxProfitCpp MaxProfit.cpp -lstdc++