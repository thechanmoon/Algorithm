import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hashset = new HashSet<Character>();

        for (j = 0; j < s.length();) {
            if (!hashset.contains(s.charAt(j))) {
                hashset.add(s.charAt(j++));
                max = Math.max(hashset.size(), max);
            } else {
                hashset.remove(s.charAt(i++));
            }
        }
        return max;
    }
}