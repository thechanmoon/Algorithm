import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0)
            return 0;
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        int res = Integer.MIN_VALUE;
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1] && dp[i] < 1 + dp[j]) {
                    dp[i] = 1 + dp[j];
                    res = Math.max(res, dp[i]);
                }
            }
        }
        return res == Integer.MIN_VALUE ? 1 : res;
    }
}