class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = 0
        j = 0
        maxLen = 0
        hashset = set();
        while i < len(s):
            if s[i] not in hashset:
                hashset.add(s[i])
                i = i+1;
                maxLen = max(maxLen, len(hashset))
            else:
               hashset.remove(s[j])
               j = j +1;
        return maxLen    

sl = Solution();
print(sl.lengthOfLongestSubstring("abcabcbb"));        