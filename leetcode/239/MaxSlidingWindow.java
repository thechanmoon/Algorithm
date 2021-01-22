
import java.util.Arrays;
public class MaxSlidingWindow {
    public int[] maxSlidingWindow1(int[] a, int k) {
        if (a == null || k <= 0) return new int[0];		 
        int[] res = new int[a.length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>(); 
        
        int index  = 0;
        for (int i = 0; i < a.length; i++) { 
            while (!deque.isEmpty() && deque.peek() < i - k + 1) // Ensure deque's size doesn't exceed k
                deque.poll();
            
           // Remove numbers smaller than a[i] from right(a[i-1]) to left, to make the first number in the deque the largest one in the window		 
            while (!deque.isEmpty() && a[deque.peekLast()] < a[i]) 
                deque.pollLast();
            
            deque.offer(i);// Offer the current index to the deque's tail
            
            if (i >= k - 1)// Starts recording when i is big enough to make the window has k elements 
                res[index++] = a[deque.peek()];
        }		 
        return res;
    }
    public static int[] maxSlidingWindow(final int[] nums, final int k) {

        if (nums.length == 1 || k == 1) {
            return nums;
        }
        final int[] result = new int[nums.length - k + 1];
        int start = 0;
        int end = Math.min(start + k, nums.length) - 1;

        int max = getMax(nums, start, end);
        int i = 0;
        result[i++] = max;

        while (end < nums.length - 1) {
            end = end + 1;
            start = start + 1;
			//if incoming is bigger than previous max, use it as new max
            if (nums[end] > max) {
                max = nums[end];
			// if outgoing was the previous max, search for new max.
            } else if (nums[start - 1] == max) {
                max = getMax(nums, start, end);
            }
            result[i++] = max;
        }

        return result;

    }

    private static int getMax(final int[] nums, final int start, final int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }


    public static void main(final String[] args) {
        final MaxSlidingWindow x = new MaxSlidingWindow();
        System.out.println(Arrays.toString(MaxSlidingWindow.maxSlidingWindow(new int[]{9, 11}, 2)));
        System.out.println(Arrays.toString(MaxSlidingWindow.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}