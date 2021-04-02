// public class Solution {
//     public bool IsPalindrome(string s) {
//         StringBuilder sb = new StringBuilder();
        
//         foreach(Char c in s.ToCharArray())
//         {
//             if(char.IsLetterOrDigit(c) )
//             {
//                 sb.Append(c);
//             }
//         }
        
//         String str = sb.ToString().ToLower();
        
//         for(int i = 0; i < str.Length/2; i++)
//         {
//             if(str[str.Length-1-i] !=  str[i])
//                 return false;
//         }
        
//         return true;
//     }
// }

using System.Text.RegularExpressions;

public class Solution {
    public bool IsPalindrome(string s) {

        s = Regex.Replace( s, "[^a-zA-Z0-9]+", "", RegexOptions.Compiled ).ToLower();

        for(int i = 0; i < s.Length/2; i++)
        {
            if(s[s.Length-1-i] !=  s[i])
                return false;
        }
        
        return true;
    }
}