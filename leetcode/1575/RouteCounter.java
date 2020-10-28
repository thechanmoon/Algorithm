import java.util.*;

class Solution {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    int[][] cache;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        cache = new int[locations.length][fuel + 1];
        for (int[] row : cache)
            Arrays.fill(row, -1);
        return dfs(locations, start, finish, fuel);
    }

    public int dfs(int[] arr, int cur, int goal, int fuel) {
        // Out of fuel, no solutions
        if (fuel < 0)
            return 0;

        // Already computed this state, return answer
        if (cache[cur][fuel] != -1) {
            return cache[cur][fuel];
        }

        int result = 0;

        // Made it to where we want to be
        if (cur == goal) {
            result++;
        }

        // Keep traveling
        for (int i = 0; i < arr.length; i++) {
            // Don't travel to where we already are
            if (i == cur)
                continue;
            int cost = Math.abs(arr[cur] - arr[i]);
            int nextTrip = dfs(arr, i, goal, fuel - cost);
            result += nextTrip;
            result %= MOD;
        }

        cache[cur][fuel] = result;
        return result;
    }
}

class RouteCounter {
    public static void main(String[] args) {
        // int[] locations = { 2, 3, 6, 8, 4 };
        // int start = 1;
        // int finish = 3;
        // int fuel = 5;

        // int[] locations = { 4, 3, 1 };
        // int start = 1;
        // int finish = 0;
        // int fuel = 6;

        int[] locations = { 2, 1, 5 };
        int start = 0;
        int finish = 0;
        int fuel = 3;

        Solution s = new Solution();
        System.out.println(s.countRoutes(locations, start, finish, fuel));
    }
}