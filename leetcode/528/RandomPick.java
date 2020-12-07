import java.util.*;

class Solution {
    int[] preSum;
    Random random;

    public Solution(int[] w) {
        random = new Random();
        preSum = new int[w.length];
        preSum[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            preSum[i] += preSum[i - 1] + w[i];
        }
    }

    public int pickIndex() {
        int sum = preSum[preSum.length - 1];
        int rand = random.nextInt(sum);

        int left = 0, right = preSum.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (rand >= preSum[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (rand < preSum[left])
            return left;
        return right;
    }
}