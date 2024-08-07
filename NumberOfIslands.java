class NumberOfIslands { 
    // No of rows and columns 
    static final int ROW = 5, COL = 5; 
  
    // A function to check if a given cell (row, col) can 
    // be included in DFS 
    boolean isSafe(int M[][], int row, int col, 
                   boolean visited[][]) 
    { 
        // row number is in range, column number is in range 
        // and value is 1 and not yet visited 
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]); 
    } 
  
    // A utility function to do DFS for a 2D boolean matrix. 
    // It only considers the 8 neighbors as adjacent vertices 
    void DFS(int M[][], int row, int col, boolean visited[][]) 
    { 
        // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; ++k) 
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) 
                DFS(M, row + rowNbr[k], col + colNbr[k], visited); 
    } 
  
    // The main function that returns count of islands in a given 
    // boolean 2D matrix 
    int countIslands(int M[][]) 
    { 
        // Make a bool array to mark visited cells. 
        // Initially all cells are unvisited 
        boolean visited[][] = new boolean[ROW][COL]; 
  
        // Initialize count as 0 and travese through the all cells 
        // of given matrix 
        int count = 0; 
        for (int i = 0; i < ROW; ++i) 
            for (int j = 0; j < COL; ++j) 
                if (M[i][j] == 1 && !visited[i][j]) // If a cell with 
                { // value 1 is not 
                    // visited yet, then new island found, Visit all 
                    // cells in this island and increment island count 
                    DFS(M, i, j, visited); 
                    ++count; 
                } 
                
        return count; 
    } 
  
    public int numIsland(int[][] grid, int treshold)
    {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }

        int numIsland = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] >= treshold){
                    numIsland += dfs(grid, i, j ,treshold);
                }
            }
        }
        return numIsland;
    }

    public int dfs(int[][] grid, int i, int j, int treshold)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] < treshold){
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

    // Driver method 
    public static void main(String[] args) throws java.lang.Exception 
    { 
        // String[] arrayLen = scanner.nextLine().split(" ");


        // int n = Integer.parseInt(arrayLen[0]);
        // int m = Integer.parseInt(arrayLen[1]);

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < arr.length; i++) {
        //     String[] arrRowItems = scanner.nextLine().split(" ");
        //     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //     for (int j = 0; j < arr[i].length; j++) {
        //         int arrItem = Integer.parseInt(arrRowItems[j]);
        //         arr[i][j] = arrItem;
        //     }
        // }

       int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
                                  { 0, 1, 0, 0, 1 }, 
                                  { 1, 0, 0, 1, 1 }, 
                                  { 0, 0, 0, 0, 0 }, 
                                  { 1, 0, 1, 0, 1 } };
                                  
        int M1[][] = new int[][] { { 0, 80, 45, 95, 170, 145 }, 
                                  { 115, 210, 60, 5, 230,230 }, 
                                  { 5, 0, 145, 250, 245, 140 }, 
                                  { 15, 5, 175, 250, 185, 165 }, 
                                  { 0, 5, 95, 115, 165, 250 },
                                  { 5, 0, 25, 5, 145, 250 }
                                 };
         NumberOfIslands I = new NumberOfIslands(); 
        System.out.println("Number of islands is: " + I.countIslands(M)); 
        System.out.println("Number of islands is: " + I.numIsland(M,1)); 
        
    } 
} // Contributed by Aakash Hasija