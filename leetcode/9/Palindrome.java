class Palindrome {
    public static void main(String[] args) {
        // Solution sl = new Solution();
        // System.out.println(sl.isPalindrome(101011));

        Solution1 sl1 = new Solution1();
        System.out.println(sl1.isPalindrome(10));
    }
}

// class Solution {
// public boolean isPalindrome(int x) {
// char[] ch = String.valueOf(x).toCharArray();
// int mid = ch.length / 2;
// for (int i = 0; i < mid; i++) {
// System.out.println(ch[i] + "," + ch[ch.length - 1 - i]);
// if (ch[i] != ch[ch.length - 1 - i]) {
// return false;
// }
// }
// return true;
// }
// }

class Solution1 {
    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;

            System.out.println("x : " + x);
            System.out.println("revertedNumber : " + revertedNumber);
        }

        // When the length is an odd number, we can get rid of the middle digit by
        // revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x =
        // 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to
        // itself), we can simply get rid of it.
        System.out.println("==================================");
        System.out.println("x : " + x);
        System.out.println("revertedNumber : " + revertedNumber);

        return (x == revertedNumber || x == revertedNumber / 10) ? true : false;
    }
}