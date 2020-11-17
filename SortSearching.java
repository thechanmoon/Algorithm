// package InterviewQuestions;

public class SortSearching {
    // 10.1 Sorted Merge: You are given two sorted arrays, A and B, where A has a
    // large enough buffer at the
    // end to hold B. Write a method to merge B into A in sorted order.

    // javascript

    // function sortedMerge(a, b) {
    // let aIndex = a.length - 1;
    // let bIndex = b.length - 1;
    // for (let j = bIndex; j > -1; j--) {
    // for (let i = aIndex; i > -1; i--) {
    // if (a[i] >= b[j]) {
    // if (i !== 0 && a[i - 1] <= b[j]) {
    // a.splice(i, 0, b[j]);
    // break;
    // } else if (i === 0) {
    // a.splice(i, 0, b[j]);
    // break;
    // }
    // } else if (a[i] < b[j]) {
    // a.splice(i + 1, 0, b[j]);
    // break;
    // }
    // }
    // }
    // return a;
    // }

    // const a = [3, 5, 6, 8, 11, 12, 13];
    // const b = [2, 4, 6, 12, 18, 19];
    // console.log(sortedMerge(a, b));

    // const a = [2, 3, 4, 5, 6, 8, 10, 100];
    // const b = [1, 4, 7, 6, 7, 7];
    // console.log(sortedMerge(a, b));

    // const a = [0,2,4];
    // const b = [1,3,5];
    // console.log(sortedMerge(a, b));

    // const a = [0,1,2];
    // const b = [3,4,5];
    // console.log(sortedMerge(a, b));

    // const a = [0,1,2];
    // const b = [];
    // console.log(sortedMerge(a, b));

    /**
     * Merges array
     * 
     * @param a      first array
     * @param b      second array
     * @param countA number of "real" elements in a
     * @param countB number of "real" elements in b
     */
    public static void merge(int[] a, int[] b, int countA, int countB) {
        int indexMerged = countB + countA - 1; /* Index of last location of merged array */
        int indexA = countA - 1; /* Index of last element in array b */
        int indexB = countB - 1; /* Index of last element in array a */

        /* Merge a and b, starting from the last element in each */
        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) { /* end of A is bigger than end of B */
                a[indexMerged] = a[indexA]; // copy element
                indexA--;
            } else {
                a[indexMerged] = b[indexB]; // copy element
                indexB--;
            }
            indexMerged--; // move indices
        }
    }

    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a[mid] < x) {
                low = mid + 1;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // O(log n)
    public static int binarySearchRecursive(int[] a, int x, int low, int high) {
        if (low > high)
            return -1; // Error

        int mid = (low + high) / 2;
        if (a[mid] < x) {
            return binarySearchRecursive(a, x, mid + 1, high);
        } else if (a[mid] > x) {
            return binarySearchRecursive(a, x, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static int binarySearch(int[] array, int num, int start, int end) {
        if (start > end)
            return -1;

        int mid = (end + start) / 2;

        if (array[mid] > num) {
            return binarySearch(array, num, start, mid - 1);
        } else if (array[mid] < num) {
            return binarySearch(array, num, mid + 1, end);
        } else {
            return mid;
        }

    }

    // Recursive algorithm to return the closest element
    public static int binarySearchRecursiveClosest(int[] a, int x, int low, int high) {
        if (low > high) { // high is on the left side now
            if (high < 0)
                return low;
            if (low >= a.length)
                return high;
            if (x - a[high] < a[low] - x) {
                return high;
            }
            return low;
        }

        int mid = (low + high) / 2;
        if (a[mid] < x) {
            return binarySearchRecursiveClosest(a, x, mid + 1, high);
        } else if (a[mid] > x) {
            return binarySearchRecursiveClosest(a, x, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static String arrayToString(int[] array) {
        if (array == null)
            return "";
        return arrayToString(array, 0, array.length - 1);
    }

    public static String arrayToString(int[] array, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            int v = array[i];
            sb.append(v + ", ");
        }
        return sb.toString();
    }

    public static void main(final String[] args) {
        // System.out.println("Test");

        int[] array = { 3, 6, 9, 12, 15, 18 };
        for (int i = 0; i < 20; i++) {
            // int loc = binarySearch(array, i);
            // int loc = binarySearch(array, i);
            int loc = binarySearch(array, i, 0, array.length - 1);
            int loc2 = binarySearchRecursive(array, i, 0, array.length - 1);
            int loc3 = binarySearchRecursiveClosest(array, i, 0, array.length - 1);
            System.out.println(i + ": " + loc + " " + loc2 + " " + loc3);
        }

        // int[] a = { 2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0 };
        // int[] b = { 1, 4, 7, 6, 7, 7 };
        // merge(a, b, 8, 6);
        // System.out.println(arrayToString(a));

    }
}
