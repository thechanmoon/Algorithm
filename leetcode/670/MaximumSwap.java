import java.util.*;

class Solution {
    public int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        char[] ans = Arrays.copyOf(A, A.length);
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                char tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                for (int k = 0; k < A.length; k++) {
                    if (A[k] != ans[k]) {
                        if (A[k] > ans[k]) {
                            ans = Arrays.copyOf(A, A.length);
                        }
                        break;
                    }
                }
                A[j] = A[i];
                A[i] = tmp;
            }
        }
        return Integer.valueOf(new String(ans));
    }
}

class Solution1 {
    public int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < A.length; i++) {
            last[A[i] - '0'] = i;
        }

        for (int i = 0; i < A.length; i++) {
            for (int d = 9; d > A[i] - '0'; d--) {
                if (last[d] > i) {
                    char tmp = A[i];
                    A[i] = A[last[d]];
                    A[last[d]] = tmp;
                    return Integer.valueOf(new String(A));
                }
            }
        }
        return num;
    }
}