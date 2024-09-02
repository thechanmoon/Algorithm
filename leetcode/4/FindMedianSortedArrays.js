/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let array = [];
    let m = nums1.length;
    let n = nums2.length;
    let i = 0;
    let j = 0;
    
    let index = 0;
    let mid = 0;
    while(i < m  && j < n )
    {
        if(nums1[i] < nums2[j])
        {
            array[index++] = nums1[i++];
        }else 
        {
            array[index++] = nums2[j++];
        }
    }
    
    while(i<n)
    {
        array[index++] = nums1[i++];
    }
    
    while (j<m)
    {
        array[index++] = nums2[j++];
    }
    
    mid = Math.floor((n+m)/2) 
    if(mid % 2 == 1)
    {
        return  array[mid];
    }else
    {
        return (array[mid] + array[mid-1])/2    
    }
};
console.log(findMedianSortedArrays([1,3],[2]));
console.log(findMedianSortedArrays([1,2],[3,4]));