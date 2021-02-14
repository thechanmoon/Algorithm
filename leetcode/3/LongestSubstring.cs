public class Solution
{
    public int LengthOfLongestSubstring(string s)
    {
        int i = 0;
        int j = 0;
        int max = 0;
        
        HashSet<Char> hashset = new HashSet<Char>();

        while (i < s.Length)
        {
            if (!hashset.Contains(s[i]))
            {
                hashset.Add(s[i++]);
                max = Math.Max(hashset.Count, max);
            }
            else
            {
                hashset.Remove(s[j++]);
            }
        }
        return max;
    }
}