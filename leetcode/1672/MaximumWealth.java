class MaximumWealth {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(sl.maximumWealth(accounts));
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}