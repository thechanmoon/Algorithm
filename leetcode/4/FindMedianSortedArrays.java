class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int[] array = new int[m+n];
        
        int index = 0;
        int mid = 0;
        while(i < m && j < n)
        {
            if( nums1[i]  < nums2[j])
                array[index++] = nums1[i++];
            else
                array[index++] = nums2[j++];
        }
        
        while(i < m)
        {
           array[index++] = nums1[i++]; 
        }
        
        while(j < n)
        {
            array[index++] = nums2[j++];
        }
        
        mid = (m+n)/2;
        
        if(mid % 2 == 1)
            return array[mid];
        else
            return (double)(array[mid] + array[mid-1])/2;
    }
}


class FindMedianSortedArrays {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.findMedianSortedArrays(new int[]{1,2},new int[]{3}));
        System.out.println(sl.findMedianSortedArrays(new int[]{1,3},new int[]{2,4}));
    }
}