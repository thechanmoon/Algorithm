
class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.longestPalindrome("babad"));
        System.out.println(sl.longestPalindrome("hackerrekcahba"));

    }
}

class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String retVal = "";
        int len = s.length();
        int index = len - 1;
        String subString = " ";
        if (s.length() < 2)
            return s;

        for (int i = 0; i < s.length(); i++) {
            for (int j = index; j > 0; j--) {

                if (max < j - i + 1 && isPalidrome(s.substring(i, j + 1))) {
                    subString = s.substring(i, j + 1);
                    System.out.println(s.substring(i, j + 1));
                    max = j - i + 1;
                    retVal = s.substring(i, j + 1);
                }
            }
        }
        return retVal;
    }

    public boolean isPalidrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}