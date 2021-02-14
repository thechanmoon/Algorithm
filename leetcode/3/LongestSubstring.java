import java.util.*;

class LongestSubstring {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.lengthOfLongestSubstring("abcabcbb"));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> hashset = new HashSet<Character>();
        while (i < s.length()) {
            if (!hashset.contains(s.charAt(i))) {
                hashset.add(s.charAt(i++));
                max = Math.max(max, hashset.size());
            } else {
                hashset.remove(s.charAt(j++));
            }        
        }
        return max;
    }
}