public class Solution {
    public int MinDeletions(string s) {
        int[] freq = new int[26];
        
        // char[] arr;
        // arr = s.ToCharArray(0, s.Length);
        
        foreach (char c in s.ToCharArray(0, s.Length)) {
            freq[c - 'a']++;
        }
		Array.Sort(freq);
        int exp = freq[25];
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            if (freq[i] > exp) {
                res += freq[i] - exp;
            } else {
                exp = freq[i];
            }
            if (exp > 0) exp--; // Lowest exp is zero, cannot be negative
        }
        return res;
    }
}