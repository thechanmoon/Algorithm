class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}

class Solution1 {
    public int titleToNumber(String columnTitle) {

        int len = columnTitle.length();
        int sum = 0;
        int num = 0;
        for (int i = 0; i < len; i++) {
            // System.out.println(columnTitle.charAt(len -i -1));
            // System.out.println(columnTitle.charAt(len -i -1) - 'A' +1);
            // System.out.println(columnTitle.charAt(i));
            // System.out.println(columnTitle.charAt(i) - 'A' +1);

            num = columnTitle.charAt(i) - 'A' + 1;
            // sum += num*(26^(len-i-1));
            sum += num * (Math.pow(26, (len - i - 1)));

            // System.out.println("num = " + num);
            // System.out.println("sum = " + sum);
        }
        // return ((columnTitle.trim().length()/26)*26+columnTitle.trim().length()%26);
        // System.out.println(columnTitle.charAt(len-1));
        // System.out.println(columnTitle.charAt(len-1) - 'A' +1);

        // num = columnTitle.charAt(len-1) - 'A' +1;
        // sum += num;

        // System.out.println("num = " + num);
        // System.out.println("sum = " + sum);

        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.titleToNumber("A"));
        System.out.println(sl.titleToNumber("AB"));
        System.out.println(sl.titleToNumber("ZY"));
    }
}