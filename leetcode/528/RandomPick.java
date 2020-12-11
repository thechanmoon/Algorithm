import java.util.*;

//e.g. w: [1,2,3,4] , so the total weight of this w array will be 1 + 2 + 3 + 4 = 10 then the probability(proportion of its weight) of each index would be 0: 1/10, 1: 2/10, 3: 3/10, 4: 4/10

//If space complexity is not a problem, then we can create a new array to store index by its frequency like this: still use my previous example, [0, 1, 1, 2, 2, 2, 3, 3, 3, 3], then generate a random number for 0 to its length. This approach takes lots of space : O(N) here N equals sum of w, but pickIndex takes O(1) time

//Another way to trade off time complexity to space complexity would be using pre calculate sum array and binary search: it tooks O(n) space and O(logN) time (n is number of w array, N is sum)



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