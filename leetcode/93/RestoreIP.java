import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();

        helper(res, s, new StringBuilder(), 0, 4);
        return res;
    }

    private void helper(List<String> res, String s, StringBuilder sb, int pos, int k) {
        if (pos == s.length()) {
            if (k == 0) {
                res.add(sb.toString());
            }
            return;
        }
        for (int i = pos; i < s.length() && i < pos + 3; i++) {
            if (k <= 0) {
                break;
            }
            String t = s.substring(pos, i + 1);
            if (t.charAt(0) == '0' && t.length() > 1) {
                break;
            }
            if (Integer.valueOf(t) < 256) {
                int len = sb.length();
                sb.append(t);
                if (i != s.length() - 1) {
                    sb.append(".");
                }
                helper(res, s, sb, i + 1, k - 1);
                sb.setLength(len);
            }
        }
    }
}