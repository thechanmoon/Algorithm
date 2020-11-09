public class CompressString {
    public String compressString(String str) {
        String newStr = compress(str);
        return str.length() < newStr.length() ? str : newStr;
    }

    private String compress(String str) {
        int count = 0;
        StringBuilder newString = new StringBuilder(getTotal(str));
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                newString.append(str.charAt(i));
                newString.append(count);
                count = 0;
            }
        }
        return newString.toString();
    }

    private int getTotal(String str) {
        int count = 0;
        int total = 0;

        // System.out.println("str.length() : " + str.length() + "");

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                total += 1 + String.valueOf(count).length();
                System.out.println("count = " + count);
                System.out.println("String.valueOf(count) = " + String.valueOf(count));
                System.out.println("String.valueOf(count).length() = " + String.valueOf(count).length());
                count = 0;
            }
        }
        // System.out.println(total + "");
        return total;
    }
}