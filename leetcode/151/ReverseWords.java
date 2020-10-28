import java.lang.*;

public class ReverseWords {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("the sky is blue"));
    }
}

class Solution {
    public String reverseWords(String s) {
        String[] retArray = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = retArray.length - 1; i > -1; i--) {
            sb.append(retArray[i] + " ");
        }
        return sb.toString();
    }
}