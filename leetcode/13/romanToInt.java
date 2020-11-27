import java.util.*;

class RomanToInt {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.romanToInt("MCMXCIV"));
        System.out.println(sl.romanToInt("III"));
    }
}

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hashmap = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        int total = 0;
        int max = 0;
        int value = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            value = hashmap.get(s.charAt(i));
            // IV V - max = 0, value = 5 , value > max , total += 5, max = 5;
            // I - max = 5, value = 1 , value < max , total -= 1, max = 5;

            // VI I - max = 0, value = 1 , value > max , total += 1, max = 1;
            // V - max = 1, value = 5 , value > max , total += 5, max = 5;
 
            if (value < max) {
                total -= value;
            } else {
                total += value;
                max = value;
            }
        }

        return total;
    }
}