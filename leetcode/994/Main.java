import java.util.*;

class Solution {
 
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] cor = { {0,1}, {0,-1}, {1,0}, {-1,0} };
        int fresh = 0, time = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                }
            }
        }
        while (!queue.isEmpty() && fresh > 0) {

            for (int i = queue.size(); i > 0; i--) {

                int[] curr = queue.poll();
                for (int d = 0; d < 4; d++) {

                    int x = curr[0] + cor[d][0];
                    int y = curr[1] + cor[d][1];

                    if (x < 0 || y < 0||  x >= grid.length || y >= grid[0].length || grid[x][y] != 1) {
                        continue;
                    }

                    grid[x][y] = 2;
                    queue.offer(new int[] { x, y });
 
                    fresh--;
                }
            }
            time++;
        }
        if(fresh<=0)
            return time;       
        return -1;    
    }
}

public class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[][] grid = new int[][] {{2,1,1},{1,1,0},{0,1,1}}; 
        System.out.println(sl.orangesRotting(grid));   
    }
}