class Longest {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        // System.out.println(sl.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                System.out.println("prefix = " + prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }        
        return prefix;
    }   
}