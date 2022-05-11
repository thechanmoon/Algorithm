class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        count = 0;
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == '1':
                    self.dfs(grid,i,j)
                    count += 1
        return count
    
    def dfs(self, grid, i , j):
        if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[i]) or grid[i][j] == '0':
            return
        
        grid[i][j] = '0'
        self.dfs(grid,i-1,j)
        self.dfs(grid,i+1,j)
        self.dfs(grid,i,j-1)
        self.dfs(grid,i,j+1)

sl = Solution()
array = [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
print(sl.numIslands(array))