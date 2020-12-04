import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Solution sl = new Solution();
        Set<String> dictionary = new HashSet<String>() {
            {
                add("leet");
                add("code");
            }
        };

        System.out.println(sl.wordBreak("leetcode", dictionary));

        dictionary.clear();
        dictionary.add("cats");
        dictionary.add("dog");
        dictionary.add("sand");
        dictionary.add("and");
        dictionary.add("cat");

        System.out.println(sl.wordBreak("catsnadog", dictionary));
    }
}

// class Solution {
// public boolean wordBreak(String s, Set<String> wordDict) {
// int n = s.length();
// if (n == 0) {
// return true;
// }

// // dp[i] = true if there is a solution in prefix s[0..i]
// boolean[] dp = new boolean[n];

// // try all possible prefixes
// for (int i = 0; i < n; i++) {
// // check from dp if current length prefix is a solution
// // if not then the prefix should be present in wordDict
// if (dp[i] == false && wordDict.contains(s.substring(0, i + 1))) {
// dp[i] = true;
// }

// // if this prefix contains in wordDict the try to extend the prefix up to end
// // of the string
// if (dp[i] == true) {
// for (int j = i + 1; j < n; j++) {
// // check id dp[j] already computed to a solution ,
// // other wise we need to check if s[i+1..i] contains in the dict.
// // so that we can create a longer prefix s[0..j]
// if (dp[j] == false) {
// dp[j] = wordDict.contains(s.substring(i + 1, j + 1));
// }
// }
// }
// }

// return dp[n - 1];
// }
// }

class Trie {
    Trie[] map = new Trie[26];
    boolean isEndWord = false;

    public Trie() {
    }
}

class Solution {

    public boolean wordBreak(String s, Set<String> wordDict) {

        Trie trie = new Trie();
        boolean[] wordEnd = new boolean[s.length()];

        // Fill trie
        for (String w : wordDict) {

            Trie cur = trie;

            for (int i = 0; i < w.length(); i++) {
                int c = w.charAt(i) - 'a';

                if (cur.map[c] == null) {
                    cur.map[c] = new Trie();
                }

                cur = cur.map[c];

                if (i == w.length() - 1)
                    cur.isEndWord = true;
            }
        }

        // Loop word
        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && !wordEnd[i - 1])
                continue;

            Trie cur = trie;

            for (int j = i; j < s.length(); j++) {

                int c = s.charAt(j) - 'a';
                if (cur.map[c] == null)
                    break;

                cur = cur.map[c];
                if (cur.isEndWord)
                    wordEnd[j] = true;
            }

        }

        return wordEnd[s.length() - 1];

    }
}

public static class Solution1 {
    /**
     * this solution takes between 7 and 8 ms to finish on LeetCode beats around 38%
     * to 48% submissions as of 6/27/2020
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        CommonUtils.printArray(dp);
        return dp[n];
    }
}

public static class Solution2 {
    /**
     * Added pruning based on max word length. this solution takes between 2 and 3
     * ms to finish on LeetCode this beats 94.53% submissions as of 6/27/2020
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for (String word : wordDict) {
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if ((i - j) > maxLen) {
                    continue;
                }
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

public static class Solution3 {
    /**
     * Added pruning, plus start from the end to check. This solution takes 1 ms to
     * finish on LeetCode This beats 99.02% submissions as of 6/27/2020.
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for (String word : wordDict) {
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int lastWordLength = 1; lastWordLength <= i && lastWordLength <= maxLen; lastWordLength++) {
                if (dp[i - lastWordLength] && wordDict.contains(s.substring(i - lastWordLength, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
