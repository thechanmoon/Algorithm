using System;
using System.Collections.Generic;
using System.IO;
class NumberOfIslands {
    
    static int numIsland(int[][] grid, int treshold)
    {
        if(grid == null || grid.Length == 0)
        {
            return 0;
        }

        int numIsland = 0;

        for(int i = 0; i < grid.Length; i++){
            for(int j = 0; j < grid[0].Length; j++){
                if(grid[i][j] >= treshold){
                    numIsland += dfs(grid, i, j ,treshold);
                }
            }
        }
        return numIsland;
    }

    static int dfs(int[][] grid, int i, int j, int treshold)
    {
        if(i < 0 || i >= grid.Length || j < 0 || j >= grid[i].Length || grid[i][j] < treshold){
            return 0;
        }
        grid[i][j] = 0;
        dfs(grid, i + 1, j ,treshold);
        dfs(grid, i - 1, j ,treshold);
        dfs(grid, i, j + 1 ,treshold);
        dfs(grid, i, j - 1 ,treshold);

        dfs(grid, i + 1, j + 1 ,treshold);
        dfs(grid, i + 1, j - 1 ,treshold);
        dfs(grid, i - 1, j + 1 ,treshold);
        dfs(grid, i - 1, j - 1 ,treshold);

        return 1;
    }
    
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        // int[] arrayMatrix = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        
        // int n = arrayMatrix[0];
        // int m = arrayMatrix[1];
        // int[][] arr = new int[n][];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        // }
        
        int [][] M1 = new int[6][];

        M1[0] = new int[] { 0, 80, 45, 95, 170, 145 };
        M1[1] = new int[] { 115, 210, 60, 5, 230,230 };
        M1[2] = new int[] { 5, 0, 145, 250, 245, 140 };
        M1[3] = new int[] { 15, 5, 175, 250, 185, 165 };
        M1[4] = new int[] { 0, 5, 95, 115, 165, 250 };
        M1[5] = new int[] { 5, 0, 25, 5, 145, 250 };
        // { { 0, 80, 45, 95, 170, 145 }, 
        //     { 115, 210, 60, 5, 230,230 }, 
        //     { 5, 0, 145, 250, 245, 140 }, 
        //     { 15, 5, 175, 250, 185, 165 }, 
        //     { 0, 5, 95, 115, 165, 250 },
        //     { 5, 0, 25, 5, 145, 250 }
        //     };

        System.Console.WriteLine(numIsland(M1,200));
    }
}