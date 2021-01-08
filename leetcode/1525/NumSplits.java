class NumSplits{
    public static void main(String[] args){
        Solution sl = new Solution();
        System.out.println(sl.numSplits("aacaba"));
    }
}
class Solution {
    public int numSplits(String s) {
        int[] left= new int[26];
        int[] right= new int[26];
        int distinct_left  = 0;
        int distinct_right  = 0;
        int retVal = 0;

        for(int i = 0; i < s.length(); i++)
        { 
           distinct_right  += ++right[s.charAt(i) - 'a'] == 1 ? 1 : 0;       
        }

        for(int i = 0; i < s.length(); i++)
        {
            distinct_left  += ++left[s.charAt(i) - 'a'] == 1 ? 1 : 0;
            distinct_right  -= --right[s.charAt(i) - 'a']== 0 ? 1 : 0;
            retVal += distinct_left  == distinct_right  ? 1 : 0;    
            
        }
        return retVal;
    }
}