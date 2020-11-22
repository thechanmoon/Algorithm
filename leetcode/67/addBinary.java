class AddBinary {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.addBinary("11", "1"));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int n1 = a.length() - 1, n2 = b.length() - 1, carry = 0;

        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int digit1 = (n1 >= 0) ? (a.charAt(n1) - '0') : 0;
            int digit2 = (n2 >= 0) ? (b.charAt(n2) - '0') : 0;

            int sum = digit1 + digit2 + carry;

            result.insert(0, sum % 2);
            carry = sum / 2;

            n1--;
            n2--;
        }

        return result.toString();
    }
}