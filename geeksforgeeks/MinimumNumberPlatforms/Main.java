import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;

        System.out.println("Minimum Number = " + new Solution().findPlatform(arr, dep, n));

    }
}

class Solution {

    int findPlatform(int arr[], int dep[], int n) {
        int max = 1, current = 1, i = 1, j = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i < n && j < n) {

            // System.out.println(arr[i] + " " + dep[j]);
            if (arr[i] < dep[j]) {
                current++;
                i++;
            }

            else if (arr[i] >= dep[j]) {
                current--;
                j++;
            }
            // System.out.println( max + " "+ current);
            max = Math.max(max, current);
        }

        return max;
    }
}