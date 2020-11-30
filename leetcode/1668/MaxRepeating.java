class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String str = word;
        while (sequence.indexOf(str) != -1) {
            str += word;
            count++;
        }
        return count;
    }
}