import java.util.*;

class PascalTriangle {
    public static void main(String[] args) {
        Solution sl = new Solution();
        // System.out.println(sl.getRow(3));
        // System.out.println(sl.getRow(0));
        System.out.println(sl.getRow(1));
        System.out.println(sl.getRow(2));
        System.out.println(sl.getRow(3));
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp;
        // if (rowIndex == 0) {
        // temp = new ArrayList<Integer>();
        // temp.add(1);
        // result.add(temp);
        // }
        for (int i = 0; i < rowIndex + 1; i++) {
            temp = new ArrayList<Integer>();
            System.out.println("========");
            // System.out.println("i : " + i);
            for (int j = 0; j <= i; j++) {
                // System.out.println("j : " + j);
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
            result.add(temp);
            // System.out.println("temp : " + temp);
        }
        // System.out.println("result : " + result);
        return result.get(rowIndex);
    }
}