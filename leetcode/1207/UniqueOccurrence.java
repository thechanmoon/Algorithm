import java.util.*;

class UniqueOccurrences{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}

class Solution{
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
    
    
    public boolean uniqueOccurrences_1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (!set.add(entry.getValue())) return false;
        return true;
    }
}