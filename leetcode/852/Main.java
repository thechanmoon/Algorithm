class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length -1;
        
        while(left < right)
        {
            int mid = left + (left+right) / 2; 
            if(arr[mid] < arr[mid+1])
            {
                left = mid+1;
            }else{
                right = mid;    
            }   
        }
        return left;
    }
}

class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.peakIndexInMountainArray(new int[]{1,2,3,2,1}));
    }
}