import java.util.Arrays;
import java.util.*;

class Reverse{
    public static void main(String[] args) {
        char[] array = {'h','e','l','l','o'};
        new Solution().reverseString(array);
        System.out.println(Arrays.toString(array));
        new Solution1().reverseString(array);
        System.out.println(Arrays.toString(array));
    }
}

class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i = 0; i < s.length>>1; i++)
        {
            temp = s[s.length-1-i]; 
            s[s.length-1-i] = s[i];
            s[i] = temp;
        }
    }
}

class Solution1 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        char t;
        
        while( i < j)
        {
            t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
}