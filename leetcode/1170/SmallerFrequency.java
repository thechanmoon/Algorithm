import java.util.*;

class SmallerFrequency {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.numSmallerByFrequency(new String[] { "cbd" }, new String[] { "zaaaz" })));
    }
}

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        // Create an aarray to store the result.
        int[] ans = new int[queries.length];

        // create arrays to store the count of the smallest character in queries and
        // words.
        int[] qr = new int[queries.length];
        int[] wor = new int[words.length];

        // fill the query array with count of min character
        for (int i = 0; i < queries.length; i++) {
            qr[i] = getMinQuery(queries[i]);
        }

        // System.out.println(Arrays.toString(qr));

        // fill the words array with count of min character
        for (int i = 0; i < words.length; i++) {
            wor[i] = getMinQuery(words[i]);
        }

        // System.out.println(Arrays.toString(wor));

        // compare each queries count with every count in words array.
        for (int i = 0; i < qr.length; i++) {

            int count = 0;
            for (int j = 0; j < wor.length; j++) {

                // increase count only when word count is more than query count.
                if (qr[i] < wor[j]) {
                    count++;
                }
            }

            // store the count in answer array.
            ans[i] = count;
        }

        return ans;

    }

    // fetch the count of the smallest character in a string -- helper fuction.
    public int getMinQuery(String s) {

        char[] charAr = s.toCharArray();
        Arrays.sort(charAr);

        int minLenQuery = 1;

        for (int i = 1; i < charAr.length; i++) {
            if (charAr[0] == charAr[i]) {
                minLenQuery++;
            }

        }
        return minLenQuery;
    }
}

class Solution1 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> list = new ArrayList<>();
        for (String str : words) {
            list.add(getPoint(str));
        }

        Collections.sort(list);

        int p = 0;
        int[] ans = new int[queries.length];
        for (String str : queries) {
            int count = getPoint(str);
            int temp = binarySearch(list, count);
            ans[p++] = list.size() - binarySearch(list, count);
        }

        return ans;
    }

    public int binarySearch(List<Integer> list, int num) {
        int i = 0;
        int j = list.size();
        while (i < j) {
            int mid = (i + j) / 2;
            if (list.get(mid) <= num) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }

        return i;
    }

    public int getPoint(String str) {
        char small_char = (char) ('z' + 1);
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
            if (small_char > str.charAt(i)) {
                small_char = str.charAt(i);
            }
        }

        return hash[small_char - 'a'];

    }
}