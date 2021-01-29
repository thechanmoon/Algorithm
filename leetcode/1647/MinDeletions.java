import java.util.*;

class MinDeletions {

    public static void main(String[] args) {
        Solution sl = new Solution();
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
            if (exp > 0) {
                exp--; // Lowest exp is zero, cannot be negative
            }
        }
        return res;
    }
}

// 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 3]
// 5 freq[i] : 3
// 6 exp : 3
// 7 exp : 3
// 1 i : 24
// 2 freq[i] : 3
// 3 exp : 2
// 4 res : 0
// ========
// 7 exp : 2
// 1 i : 23
// 2 freq[i] : 2
// 3 exp : 1
// 4 res : 1
// ========
// 7 exp : 1
// 2