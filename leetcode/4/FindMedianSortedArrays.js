/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let m = nums1.length;
    let n = nums2.length;
    let i = 0;
    let j = 0;
    let k = 0;
    let array = [];
    while (i < m && j < n)
    {
        if(nums1[i] < nums2[j])
        {
            array[k++] = nums1[i++];
        }else
        {
            array[k++] = nums2[j++];        
        }
    }
    
    if(i < m)
    {
        while (i < m)
        {
            array[k++] = nums1[i++];
        }
    }
    
    if(j < n)
    {
        while (j < n)
        {
            array[k++] = nums2[j++];
        }
    }
    
    let mid = Math.floor((m+n)/2)
    // console.log(mid);
    // console.log(array)
    if((m+n)%2 == 1)
    {
        return array[mid];        
    }else{
        return (array[mid] + array[mid -1])/2
    }
};

console.log(findMedianSortedArrays([1,2],[3,4]));