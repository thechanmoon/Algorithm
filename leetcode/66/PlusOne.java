import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.plusOne(new int[] { 9, 9, 9 })));
        System.out.println(Arrays.toString(sl.plusOne(new int[] { 1, 2, 3 })));
    }

}

class Solution {
    // public int[] plusOne(int[] digits) {
    // int sum = 1;
    // int length = 0;
    // for (int i = 0; i < digits.length; i++) {
    // sum += digits[i] * Math.pow(10, digits.length - 1 - i);
    // }

    // length = String.valueOf(sum).length();
    // int[] result = new int[length];
    // int index = 0;
    // while (sum > 0) {
    // result[length - 1 - index] = sum % 10;
    // sum = sum / 10;
    // index++;
    // }

    // return result;
    // }

    public int[] plusOne(int[] digits) {
        boolean bCarry = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9)
                bCarry = true;
        }
        if (bCarry) {
            int carry = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                int temp = digits[i];
                digits[i] = (digits[i] + carry) % 10;
                carry = (temp + carry) / 10;
            }
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}