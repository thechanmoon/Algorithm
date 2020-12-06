class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = (left + right) >> 1;
            double mul = Math.pow(mid, 2);
            if (mul == x) {
                return mid;
            } else if (mul > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}