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

        System.out.println(Arrays.toString(freq));

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            if (freq[i] > exp) {
                System.out.println("1 i : " + i);
                System.out.println("2 freq[i] : " + freq[i]);
                System.out.println("3 exp : " + exp);
                System.out.println("4 res : " + res);
                res += freq[i] - exp;
            } else {
                System.out.println("5 freq[i] : " + freq[i]);
                System.out.println("6 exp : " + exp);
                exp = freq[i];
            }
            if (exp > 0) {
                System.out.println("7 exp : " + exp);
                exp--; // Lowest exp is zero, cannot be negative
            }
            System.out.println("========");
        }
        return res;
    }
}