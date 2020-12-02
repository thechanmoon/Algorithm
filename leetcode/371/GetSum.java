class GetSum {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.prinln(sl.getSum(1, 2))
    }
}

class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;

        // return (2(a&b) + (a^b))
    }
}