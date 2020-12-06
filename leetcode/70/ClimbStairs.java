class ClimbStairs {
    public static void main(String[] args) {
        Solution sl = new Solution();
        for (int i = 1; i < 10; i++) {
            System.out.println(sl.climbStairs(i));
        }

    }
}

class Solution1 {
    public int climbStairs(int n) {

        if (n <= 1)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}

class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;

        int first = 1;
        int second = 2;
        int third = 0;

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}