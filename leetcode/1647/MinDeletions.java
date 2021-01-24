import java.util.*;

class MinDeletions {

    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.minDeletions("aaabbbcc"));
    }
}

class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int exp = freq[25];
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            if (freq[i] > exp) {
                res += freq[i] - exp;
            } else {
                exp = freq[i];
            }
            if (exp > 0)
                exp--; // Lowest exp is zero, cannot be negative
        }
        return res;
    }
}