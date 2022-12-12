// import java.lang.*;

class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.longestPalindrome("babad"));
        //System.out.println(sl.longestPalindrome("hackerrekcahba"));
        System.out.println(sl.longestPalindrome("aba"));

    }
}

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            System.out.println("before =====");
            System.out.println("i = " + i + " len = " + len + " start = " + start + " end " + end);
            if(len > end - start){
                start = i - ((len -1)/2);
                end = i + ((len)/2);
            }  
            System.out.println("after =====");
            System.out.println("i = " + i + " len = " + len + " start = " + start + " end " + end);          
        }
        return s.substring(start, end +1);
    }

    public int expandFromMiddle(String s, int left, int right){
        if(s == null || right > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right))
        {
            left--;
            right++;
        }

        return right -left -1;
    }
}

class Solution1  {
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