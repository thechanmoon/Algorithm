class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                ret += map.get(num);
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }
        }
        return ret;
    }
}