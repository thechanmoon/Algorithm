class Solution {
    public String convertToTitle(int columnNumber) {
        if (columnNumber < 1)
            return null;

        String title = "";

        while (columnNumber > 0) {

            title = (char) ((--columnNumber % 26) + 65) + title;

            System.out.println("columnNumber before : " + columnNumber);

            columnNumber = columnNumber / 26;

            System.out.println("columnNumber after : " + columnNumber);

        }
        return title;
    }
}

class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.convertToTitle(1));

        System.out.println(sl.convertToTitle(26));

        System.out.println(sl.convertToTitle(27));

        //System.out.println(sl.convertToTitle(270));

        // for (int i = 0; i < 60; i++) {
        // System.out.println("result = " + sl.convertToTitle(i));
        // System.out.println("==================");
        // }
    }
}