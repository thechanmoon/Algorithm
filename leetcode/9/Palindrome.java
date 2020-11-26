class Palindrome {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isPalindrome(10));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        int mid = ch.length / 2;
        for (int i = 0; i < mid; i++) {
            System.out.println(ch[i] + "," + ch[ch.length - 1 - i]);
            if (ch[i] != ch[ch.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}