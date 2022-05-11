#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void dfs(char **grid, int i, int j, int gridSize, int *gridColSize)
{
    if (i < 0 || j < 0 || i >= gridSize || j >= gridColSize[i] || grid[i][j] == '0')
    {
        return;
    }

    grid[i][j] = '0';
    dfs(grid, i + 1, j, gridSize, gridColSize);
    dfs(grid, i - 1, j, gridSize, gridColSize);
    dfs(grid, i, j + 1, gridSize, gridColSize);
    dfs(grid, i, j - 1, gridSize, gridColSize);
}

int numIslands(char **grid, int gridSize, int *gridColSize)
{
    int count = 0;
    int i, j = 0;
    for (i = 0; i < gridSize; i++)
    {
        for (j = 0; j < gridColSize[i]; j++)
        {
            if (grid[i][j] == '1')
            {
                dfs(grid, i, j, gridSize, gridColSize);
                count++;
            }
        }
    }
    return count;
}

int main()
{

}

//gcc -o aNumIsland NumIsland.c