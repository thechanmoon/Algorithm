class Solution {
    public int findNthDigit(int n) {
        long lim = 9;
        long power = 1;
        long multiplier = 1;

        while (n > lim * power * multiplier) {
            n -= lim * power * multiplier;
            multiplier++;
            power *= 10;
        }

        n--;
        long number = power + n / multiplier;
        long digit = multiplier - 1 - (n % multiplier);
        while (digit > 0) {
            number = (number - number % 10) / 10;
            digit--;
        }
        return ((int) number % 10);
    }
}