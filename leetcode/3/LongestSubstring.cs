public class Solution
{
    public int LengthOfLongestSubstring(string s)
    {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Char> hashset = new HashSet<Char>();

        for (j = 0; j < s.Length;)
        {
            if (!hashset.Contains(s[j]))
            {
                hashset.Add(s[j++]);
                max = Math.Max(hashset.Count, max);
            }
            else
            {
                hashset.Remove(s[i++]);
            }
        }
        return max;
    }
}