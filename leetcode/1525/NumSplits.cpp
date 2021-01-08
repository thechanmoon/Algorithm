class Solution {
public:
    int numSplits(string s) {
        int left[26]= {};
        int right[26]= {};
        int distinct_left  = 0;
        int distinct_right  = 0;
        int retVal = 0;

        for(int i = 0; i < s.size(); i++)
        { 
           distinct_right  += ++right[s[i] - 'a'] == 1;       
        }

        for(int i = 0; i < s.size(); i++)
        {
            distinct_left  += ++left[s[i] - 'a'] == 1;
            distinct_right  -= --right[s[i] - 'a']== 0;
            retVal += distinct_left  == distinct_right;    
            
        }
        return retVal; 
    }
};																	