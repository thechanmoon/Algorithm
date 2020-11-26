// import java.lang.*;
// import java.lang.StringBuilder;

class Reverse {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.reverse(-123));
        System.out.println(sl.reverse(123));
        // System.out.println(sl.reverse(-2147483648));
    }
}

class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            // System.out.println("rev * 10 : " + rev * 10);
            // System.out.println("x % 10 : " + (x % 10));
            // System.out.println("rev * 10 + x % 10 : " + (rev * 10 + x % 10));

            rev = rev * 10 + x % 10;

            x = x / 10;
            // System.out.println("x / 10 : " + (x / 10));
            // System.out.println("=========");

        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int) rev;
    }
}