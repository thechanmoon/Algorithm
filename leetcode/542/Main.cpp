#include <iostream>
#include <vector>
#include <bits/stdc++.h>
// #include <map>
using namespace std;
class Solution
{
public:
    vector<vector<int>> updateMatrix(vector<vector<int>> &matrix)
    {
        int rows = matrix.size();
        if (rows == 0)
            return matrix;
        int cols = matrix[0].size();
        vector<vector<int>> dist(rows, vector<int>(cols, INT_MAX));
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    dist[i][j] = 0;
                }
                else
                {
                    for (int k = 0; k < rows; k++)
                    {
                        for (int l = 0; l < cols; l++)
                        {
                            if (matrix[k][l] == 0)
                            {
                                int dist_01 = abs(k - i) + abs(l - j);
                                dist[i][j] = min(dist[i][j], abs(k - i) + abs(l - j));
                            }
                        }
                    }
                }
            }
        }
        return dist;
    }
};

class Solution1
{
public:
    vector<vector<int>> updateMatrix(vector<vector<int>> &matrix)
    {
        int rows = matrix.size();
        if (rows == 0)
            return matrix;
        int cols = matrix[0].size();
        vector<vector<int>> dist(rows, vector<int>(cols, INT_MAX));
        queue<pair<int, int>> q;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    dist[i][j] = 0;
                    q.push({i, j}); // Put all 0s in the queue.
                }
            }
        }

        int dir[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!q.empty())
        {
            pair<int, int> curr = q.front();
            q.pop();
            for (int i = 0; i < 4; i++)
            {
                int new_r = curr.first + dir[i][0], new_c = curr.second + dir[i][1];
                if (new_r >= 0 && new_c >= 0 && new_r < rows && new_c < cols)
                {
                    if (dist[new_r][new_c] > dist[curr.first][curr.second] + 1)
                    {
                        dist[new_r][new_c] = dist[curr.first][curr.second] + 1;
                        q.push({new_r, new_c});
                    }
                }
            }
        }
        return dist;
    }
};

class Solution2
{
public:
    vector<vector<int>> updateMatrix(vector<vector<int>> &matrix)
    {
        int rows = matrix.size();
        if (rows == 0)
            return matrix;
        int cols = matrix[0].size();
        vector<vector<int>> dist(rows, vector<int>(cols, INT_MAX - 100000));

        // First pass: check for left and top
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    dist[i][j] = 0;
                }
                else
                {
                    if (i > 0)
                        dist[i][j] = min(dist[i][j], dist[i - 1][j] + 1);
                    if (j > 0)
                        dist[i][j] = min(dist[i][j], dist[i][j - 1] + 1);
                }
            }
        }

        // Second pass: check for bottom and right
        for (int i = rows - 1; i >= 0; i--)
        {
            for (int j = cols - 1; j >= 0; j--)
            {
                if (i < rows - 1)
                    dist[i][j] = min(dist[i][j], dist[i + 1][j] + 1);
                if (j < cols - 1)
                    dist[i][j] = min(dist[i][j], dist[i][j + 1] + 1);
            }
        }
        return dist;
    }
};