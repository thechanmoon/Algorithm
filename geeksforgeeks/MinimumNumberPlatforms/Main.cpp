#include <algorithm>
#include <iostream>
using namespace std;

// Returns minimum number of platforms required
int findPlatform(int arr[], int dep[], int n)
{
    int max = 1, current = 1, i = 1, j = 0;

    sort(arr, arr + n);
    sort(dep, dep + n);

    while(i < n && j < n){
        if(arr[i] <= dep[j]){
            current++;
            i++;
        }else if(arr[i] > dep[j]){
            current--;
            j--;
        }
        max = std::max(max,current);
    }
    return max;
}

int main()
{
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Minimum Number of Platforms Required = "
         << findPlatform(arr, dep, n)
         << "\n";
    return 0;
}
//g++ - std = c++ 17 - o Main Main.cpp