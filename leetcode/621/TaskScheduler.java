import java.util.*;

class TaskScheduer {
    public static void main(String[] args) {
        Solution sl = new Solution();
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        System.out.println(sl.leastInterval(tasks, 2));
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] char_map = new int[26];
        for (char c : tasks) {
            char_map[c - 'A']++;

        }

        Arrays.sort(char_map);
        int max_val = char_map[25] - 1;
        int idle_slot = max_val * n;

        for (int i = 24; i >= 0; i--) {
            idle_slot -= Math.min(char_map[i], max_val);
        }
        return idle_slot > 0 ? idle_slot + tasks.length : tasks.length;
    }
}

/*
 * considering a tasks AAABBBBCCCC, n = 2; find the character with highest
 * frequency (maxLen) and how many of those characters, here are B and C with
 * maxLen (4) there are two characters with maxLen, so count = 2; in order to
 * accormodate all B and C, at least we need; C B _ C B _ C B _ C B (max - 1) *
 * (1 + n) + count, all other characters can be placed in the idle position, or
 * squeeze in the middle int this we can put A as C B A C B A C B A C B; if the
 * task is AAADDDBBBBCCCC, n = 2; after putting A, all idle positions are
 * occupied, so squeeze D in to the sequence as C B A D C B A D C B A D C B
 */
class Solution1 {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        int max = 0, count = 0;
        for (char c : tasks) {
            int index = c - 'A';
            map[index]++;
            if (map[index] == max)
                count++;
            else if (map[index] > max) {
                max = map[index];
                count = 1;
            }
        }
        return Math.max((max - 1) * (1 + n) + count, tasks.length);
    }
}