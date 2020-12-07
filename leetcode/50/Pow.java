class Solution {
    public double myPow(double x, int n) {
        if (n == 1)
            return x;
        if (n == 0)
            return 1;
        if (n == 2)
            return x * x;
        while (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            n = -1 * n;
            x = 1 / x;
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}