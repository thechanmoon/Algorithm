import java.math.BigInteger;

class addString {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.addStrings("6913259244", "71103343"));
        System.out.println(sl.addStrings("3876620623801494171", "6529364523802684779"));
    }
}

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        // StringBuffer result = new StringBuffer();
        int n1 = num1.length() - 1, n2 = num2.length() - 1, carry = 0;

        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int digit1 = (n1 >= 0) ? (num1.charAt(n1--) - '0') : 0;
            int digit2 = (n2 >= 0) ? (num2.charAt(n2--) - '0') : 0;

            int sum = digit1 + digit2 + carry;

            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        return result.toString();
    }
}

// 111

// len 3
// i = 2 0 len -1 -i
// i = 1 1
// i = 0 2
// 10^2 10^1 10^0