public class Solution {
    public bool IsPalindrome(string s) {
        StringBuilder sb = new StringBuilder();
        
        foreach(Char c in s.ToCharArray())
        {
            if(char.IsLetterOrDigit(c) )
            {
                sb.Append(c);
            }
        }
        
        String str = sb.ToString().ToLower();
        
        for(int i = 0; i < str.Length/2; i++)
        {
            if(str[str.Length-1-i] !=  str[i])
                return false;
        }
        
        return true;
    }
}