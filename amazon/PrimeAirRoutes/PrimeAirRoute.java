class PairInt{
	int first;
	int second;
	public PairInt(int first,int second){
		this.first=first;
		this.second=second;
	}
}

class Solution{
  public List<PairInt> getOptimizedUtilize(int maxTravelDist, List<PairInt> forwardRouteList, List<PairInt> returnRouteList){
  List<PairInt> result=new ArrayLust<>();
  int max=Integer.MIN_VALUE;
  for(int i=0;i<forwardRouteList.size();i++){
	  for(int j=0;j<returnRouteList.size();j++){
		  int sum=forwardRouteList.get(i).second +returnRouteList.get(i).second;
		  if(sum<=maxTravelDist){
			  if(sum>max){
				  max=sum;
				  result=new ArrayList<>();
				  result.add(new PairInt(forwardRouteList.get(i).first, returnRouteList.get(j).first));
			  }else{
				 result.add(new PairInt(forwardRouteList.get(i).first, returnRouteList.get(j).first));
			  }
		   }
		}
	}
	return result;
}

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.TreeMap;

// public class PrimeAirRoute {
//     public static int[][] getOptimalRoute(int maxTravelDist, int[][] forwardRoute, int[][] returnRoute) {
//         TreeMap<Integer, ArrayList<Integer>> returnMap = new TreeMap<>(); // dist -> id
//         for (int[] r : returnRoute) { // O(r log r)
//             if (!returnMap.containsKey(r[1])) { // log(r)
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(r[0]);
//                 returnMap.put(r[1], list); // log(r)
//             } else {
//                 returnMap.get(r[1]).add(r[0]); // log(r)
//             }
//         }

//         int minRemainder = maxTravelDist;
//         ArrayList<int[]> result = new ArrayList<>();
//         for (int[] f : forwardRoute) { // O(f * (log(r) + r))
//             int returnDistSearch = maxTravelDist - f[1];
//             Integer maxReturnDist = returnMap.floorKey(returnDistSearch); // log (r)
//             if (maxReturnDist == null)
//                 continue;

//             int remainderDist = returnDistSearch - maxReturnDist;
//             if (remainderDist < minRemainder) {
//                 minRemainder = remainderDist;
//                 result.clear();
//                 // log(r) + r, where r is the duplicated return idx (worst case all items are duplicate)
//                 for(int returnIdx : returnMap.get(maxReturnDist)) {
//                     result.add(new int[] { f[0], returnIdx});
//                 }
//             } else if (remainderDist == minRemainder) {
//                 // log(r) + r, where r is the duplicated return idx (worst case all items are duplicate)
//                 for(int returnIdx : returnMap.get(maxReturnDist)) {
//                     result.add(new int[] { f[0], returnIdx});
//                 }
//             }
//         }

//         // O(r log r + f (log (r)+r))
//         return result.toArray(new int[0][]);
//     }

//     private static void test(int maxTravelDist, int[][] forwardRoute, int[][] returnRoute, int[][] expected) {
//         System.out.println("maxTravelDist: " + maxTravelDist);
//         System.out.println("forwardRoute: " + Arrays.deepToString(forwardRoute));
//         System.out.println("returnRoute: " + Arrays.deepToString(returnRoute));
//         System.out.println("expected: " + Arrays.deepToString(expected));
//         int[][] actual = getOptimalRoute(maxTravelDist, forwardRoute, returnRoute);
//         System.out.println("actual: " + Arrays.deepToString(actual));
//     }

//     public static void runner() {
//         System.out.println("PrimeAirRoute");
//         test(
//             7000,
//             new int[][] { { 1, 2000 }, { 2, 4000 }, { 3, 6000 } },
//             new int[][] { { 1, 2000 } },
//             new int[][] { { 2, 1 } });
//         test(
//             10000,
//             new int[][] { { 1, 3000 }, { 2, 5000 }, { 3, 7000 }, { 4, 10000 } },
//             new int[][] { { 1, 2000 }, { 2, 3000 }, { 3, 4000 }, { 4, 5000 } },
//             new int[][] { { 2, 4 }, { 3, 2 } });
//         test(
//             10,
//             new int[][] { { 1, 5 }, { 2, 5 } },
//             new int[][] { { 1, 5 }, { 2, 5 } },
//             new int[][] { { 1, 1 }, { 1, 2 }, { 2, 1}, { 2, 2 }});
//     }

//     public static void main(String[] ars){
//         runner();
//     }
// }