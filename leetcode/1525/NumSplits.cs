public class Solution {
    public int NumSplits(string s) {
        int[] left= new int[26];
        int[] right= new int[26];
        int distinct_left  = 0;
        int distinct_right  = 0;
        int retVal = 0;

        for(int i = 0; i < s.Length; i++)
        { 
           distinct_right  += ++right[s[i] - 'a'] == 1 ? 1 : 0;       
        }

        for(int i = 0; i < s.Length; i++)
        {
            distinct_left  += ++left[s[i] - 'a'] == 1 ? 1 : 0;
            distinct_right  -= --right[s[i] - 'a']== 0 ? 1 : 0;
            retVal += distinct_left  == distinct_right  ? 1 : 0;    
            
        }
        return retVal; 
    }
}