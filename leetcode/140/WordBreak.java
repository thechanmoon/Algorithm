import java.util.*;

class Solution {

    Map<Integer, List<String>> cache;

    public List<String> wordBreak(String s, List<String> wordDict) {
        TrieNode root = buildTrie(wordDict);
        this.cache = new HashMap<>();
        return search(root, s, 0);
    }

    private List<String> search(TrieNode root, String s, int idx) {
        if (cache.containsKey(idx))
            return cache.get(idx);
        List<String> result = new ArrayList<String>();
        int n = s.length();
        if (idx == n)
            return result;

        TrieNode node = root;

        for (int i = idx; i < n; i++) {
            char c = s.charAt(i);
            node = node.next[c - 'a'];

            if (node == null)
                break;

            if (node.isWord) {
                String word = s.substring(idx, i + 1);

                if (i == n - 1)
                    result.add(word); // reached end
                else {
                    List<String> list = search(root, s, i + 1);
                    for (int j = 0; j < list.size(); j++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(word).append(" ").append(list.get(j));
                        result.add(sb.toString());
                    }
                }
            }
        }
        cache.put(idx, result);
        return result;
    }

    private TrieNode buildTrie(List<String> words) {
        TrieNode root = new TrieNode();
        for (String s : words) {
            TrieNode node = root;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (node.next[c - 'a'] == null) {
                    node.next[c - 'a'] = new TrieNode();
                }
                node = node.next[c - 'a'];
            }
            node.isWord = true;
        }
        return root;
    }
}

class TrieNode {
    TrieNode[] next = new TrieNode[26];
    boolean isWord;
}

// Solution 1: Hack is before doing dfs just check whether string isBreakable of
// not.

// Solution 2:
// Start searching first word [left] from starting of string once we find the
// left call wordBreak method for right part of string if solution exist we will
// get List of words then just append left in all soliutions we found for right.
// Repeat.

// There are few very big test cases where substring repeasts multiple times so
// we are processing lots of repeated subproblems - lets cache the solution of
// repeated problem and make use later.

class Solution1 {
    Map<String, List<String>> map = new HashMap();

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (map.containsKey(s))
            return map.get(s);
        List<String> result = new LinkedList<>();
        if (wordDict.contains(s))
            result.add(s);
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            if (wordDict.contains(left)) {
                for (String ss : wordBreak(s.substring(i), wordDict)) {
                    result.add(left + " " + ss);
                }
            }
        }

        map.put(s, result);
        return result;
    }
}

class Solution2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList();
        if (isWordBreak(s, wordDict))
            wb(s, "", new HashSet(wordDict), result);
        return result;
    }

    private void wb(String s, String sent, Set<String> wordDict, List<String> result) {
        if (s.isEmpty()) {
            result.add(sent.trim());
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i))) {
                wb(s.substring(i), sent + s.substring(0, i) + " ", wordDict, result);
            }
        }
    }

    public boolean isWordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}