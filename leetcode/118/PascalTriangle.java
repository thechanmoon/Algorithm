import java.util.*;

class PascalTriangle {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.generate(5));
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prevList = new ArrayList<Integer>();

        for (int r = 1; r <= numRows; r++) {
            List<Integer> tempList = new ArrayList<Integer>();
            for (int c = 1; c <= r; c++) {
                if (c == 1 || c == r) {
                    tempList.add(1);
                } else {
                    tempList.add(prevList.get(c - 2) + prevList.get(c - 1));
                }
            }

            prevList = tempList;
            result.add(tempList);
        }

        return result;

    }
}

// class Solution {
// public List<List<Integer>> generate(int numRows) {
// List<List<Integer>> result = new ArrayList<List<Integer>>();
// for (int r = 1; r <= numRows; r++) {
// List<Integer> tempList = new ArrayList<Integer>();
// for (int c = 1; c <= r; c++) {
// if (c == 1 || c == r) {
// tempList.add(1);
// } else {
// System.out.println(r + "," + c);
// System.out.println(result);
// tempList.add(result.get(r - 2).get(c - 2) + result.get(r - 2).get(c - 1));
// }
// }
// result.add(tempList);
// }
// return result;
// }
// }

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int r = 0; r < numRows; r++) {
            List<Integer> tempList = new ArrayList<Integer>();
            for (int c = 0; c < r + 1; c++) {
                if (c == 0 || c == r) {
                    tempList.add(1);
                } else {
                    // System.out.println(r + "," + c);
                    // System.out.println(result);
                    tempList.add(result.get(r - 1).get(c - 1) + result.get(r - 1).get(c));
                }
            }
            result.add(tempList);
        }

        return result;

    }
}