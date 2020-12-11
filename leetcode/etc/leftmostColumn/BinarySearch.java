import java.util.*;

class BinarySearch {

    // Driver Code
    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 1, 1 } };

        System.out.print(new Solution().search(mat, 3, 3));
    }
}

class Solution {
    final int N = 3;

    // Function to search for the
    // leftmost column of the matrix
    // with atleast a 1 in sorted
    // binary matrix
    int search(int mat[][], int n, int m) {
        int i, a = Integer.MAX_VALUE;

        // Loop to iterate over all the
        // rows of the matrix
        for (i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int mid;
            int ans = Integer.MAX_VALUE;

            // Binary Search to find the
            // leftmost occurence of the 1
            while (low <= high) {
                mid = (low + high) / 2;

                // Condition if the column
                // contains the 1 at this
                // position of matrix
                if (mat[i][mid] == 1) {
                    if (mid == 0) {
                        ans = 0;
                        break;
                    } else if (mat[i][mid - 1] == 0) {
                        ans = mid;
                        break;
                    }
                }
                if (mat[i][mid] == 1)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // If there is a better solution
            // then update the answer
            if (ans < a)
                a = ans;
        }

        // Condition if the solution
        // doesn't exist in the matrix
        if (a == Integer.MAX_VALUE)
            return -1;
        return a + 1;
    }
}