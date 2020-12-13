
// "static void main" must be defined in a public class.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> res1 = optimize(7000, new int[][] { { 1, 2000 }, { 2, 4000 }, { 3, 6000 } },
                new int[][] { { 1, 2000 } });
        List<List<Integer>> res2 = optimize(10000, new int[][] { { 1, 3000 }, { 2, 5000 }, { 3, 7000 }, { 4, 10000 } },
                new int[][] { { 1, 3000 }, { 2, 2000 }, { 3, 5000 }, { 4, 4000 } }); // unsorted
        System.out.println(res1);
        System.out.println(res2);
    }

    // m log m + n log m where m = length of forward and n = length of return
    public static List<List<Integer>> optimize(int maxTravelDist, int[][] forwardRoutes, int[][] returnRoutes) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int[] forwardRoute : forwardRoutes) {
            treeMap.put(forwardRoute[1], forwardRoute[0]);
        }

        List<List<Integer>> pairs = new LinkedList<>();

        int max = 0;
        for (int[] returnRoute : returnRoutes) {
            int key = returnRoute[0];
            int dist = returnRoute[1];

            if (maxTravelDist - dist <= 0)
                continue;

            int diff = maxTravelDist - dist;
            Integer closestDist = treeMap.floorKey(diff);
            if (closestDist == null)
                continue;

            if (closestDist + dist >= max) {
                if (closestDist + dist > max) {
                    max = closestDist + dist;
                    pairs.clear(); // Clean up
                }

                List<Integer> pair = new ArrayList<>();
                pair.add(treeMap.get(closestDist));
                pair.add(key);
                pairs.add(pair);
            }
        }

        return pairs;
    }
}