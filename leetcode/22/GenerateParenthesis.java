import java.util.*;

class GenerateParenthesis {
    public static void main(String[] args) {
        Solution sl = new Solution();
        List<String> output_arr = sl.generateParenthesis(3);
        System.out.println(output_arr.toString());
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList();
        backtrack(output_arr, "", 0, 0, n);
        return output_arr;
    }

    public void backtrack(List<String> output_arr, String current_string, int open, int close, int max) {
        if (current_string.length() == max * 2) {
            output_arr.add(current_string);
            return;
        }

        if (open < max)
            backtrack(output_arr, current_string + "(", open + 1, close, max);
        if (close < open)
            backtrack(output_arr, current_string + ")", open, close + 1, max);
    }
}

class Solution1 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        backtrack("", n, n, ans);
        return ans;
    }

    public void backtrack(String path, int l, int r, List<String> ans) {
        if (l == 0 && r == 0) {
            ans.add(path);
            return;
        }
        if (l < r) {
            if (l != 0) {
                backtrack(path + '(', l - 1, r, ans);
            }
            backtrack(path + ')', l, r - 1, ans);
        } else if (l == r) {
            backtrack(path + '(', l - 1, r, ans);
        }
    }
}

class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(')
                balance++;
            else
                balance--;
            if (balance < 0)
                return false;
        }
        return (balance == 0);
    }
}

class Solution3 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left : generateParenthesis(c))
                    for (String right : generateParenthesis(n - 1 - c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
}