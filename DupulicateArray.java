// { Driver Code Starts
import java.io.*;
import java.util.*;

class DupulicateArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        //     int n = sc.nextInt();
        //     int[] a = new int[n];
        //     for (int i = 0; i < n; i++)
        //     { 
        //         a[i] = sc.nextInt();
        //     }
        //     Solution g = new Solution();
        //     ArrayList<Integer> ans = g.duplicates(a, n);
        //     System.out.println("ans.size(): " + ans.size());
        //     for (Integer val : ans) System.out.print(val + " ");
        //     System.out.println();
        // }
        // sc.close();
        int[] a = {17,27,11,23,14,29,17,24,3,6,18,8,18,16,29,11,24,5,0,1,28,3,28,4,13,7,7,27,10,21};    
        int[] aa = { 17, 27, 11, 23, 14, 29, 17, 24, 3, 6, 18, 8, 18, 16, 29, 11, 24, 5, 0, 1, 28, 3, 28, 4, 13, 7, 7,
                27, 10, 21 };
        // int[] a = { 1, 2, 3, 1, 3, 9, 9, 4, 5, 5 };    
        Solution g = new Solution();
        ArrayList<Integer> ans = g.duplicates(a, a.length);
        // System.out.println("ans.size(): " + ans.size());
        // System.out.println("a.size(): " + a.length);
        for (Integer val : ans)
            System.out.print(val + " ");
        System.out.println();

        g.printRepeating(aa, aa.length);
    }
}
// } Driver Code Ends


class Solution {
    public ArrayList<Integer> duplicates(int nums[], int n) {
        // code here
        // System.out.println("arr.size(): " + arr.length);
        // System.out.println("n: " + n);
        // HashMap <Integer,Boolean> hashmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {                
            int index = Math.abs(nums[i]);
            if(nums[index] < 0 && !list.contains(index))
            {
                list.add(index);
            }else
            {
                nums[index] = -nums[index];
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }else
        {
            Collections.sort(list);
        }
        return list;
    }

    void printRepeating(int arr[], int size) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
}