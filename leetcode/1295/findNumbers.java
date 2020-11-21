class FindNumbers {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumberDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean isEvenNumberDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }
}