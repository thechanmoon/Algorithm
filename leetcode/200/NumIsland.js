var numIslands = function(grid) {
    // if (grid == null || grid.length == 0) {
    //     return 0;
    // }

    let numIsland = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                dfs(grid, i, j);
                numIsland++;
            }
        }
    }
    return numIsland;
};

var dfs = function(grid, i, j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
        return;
    }
    grid[i][j] = '0';
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);

    // dfs(grid, i + 1, j + 1);
    // dfs(grid, i + 1, j - 1);
    // dfs(grid, i - 1, j + 1);
    // dfs(grid, i - 1, j - 1);
}

let grid = [[ '1', '1', '1', '1', '0' ], [ '1', '1', '0', '1', '0' ], [ '1', '1', '0', '0', '0' ],
[ '0', '0', '0', '0', '0' ]];

console.log(numIslands(grid));