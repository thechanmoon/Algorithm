class LastWord {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.lengthOfLastWord("Hello World"));
    }
}

class Solution {
    // public int lengthOfLastWord(String s) {
    // String words[] = s.split(" ");

    // if(words == null || words.length == 0)
    // return 0;

    // return words[words.length-1].length();
    // }

    // int lengthOfLastWord(String s) {
    // int counter = 0;
    // boolean found = false;
    // for (int i = s.length() - 1; i >= 0; i--) {
    // if (s.charAt(i) != ' ') {
    // counter++;
    // found = true;
    // } else if (s.charAt(i) == ' ' && found) {
    // break;
    // }
    // }
    // return counter;

    // }

    // public int lengthOfLastWord(String s) {
    // int counter = 0;
    // for (int i = s.length() - 1; i >= 0; i--) {
    // if (s.charAt(i) != ' ') {
    // counter++;
    // } else if (s.charAt(i) == ' ' && counter > 0) {
    // break;
    // }
    // }
    // return counter;
    // }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return (s.substring(s.lastIndexOf(" ") + 1)).length();
    }
};