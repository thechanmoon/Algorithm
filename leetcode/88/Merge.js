var merge = function(nums1, m, nums2, n) {
    let i = m-1;
    let j = n-1;

    for(let k = m + n -1; k >-1; k--){
        if(j<0)
            break;
        console.log(i,j,k,nums1[i],nums2[j],nums1[k])
        console.log(nums1);
        if(nums1[i] > nums2[j])
        {
            nums1[k] = nums1[i];
            i--;
        }else
        {
            nums1[k] = nums2[j];    
            j--;
        }
    }
};
let num1 = [1,2,3,0,0,0];
merge(num1,3,[2,5,6],3)
console.log(num1)