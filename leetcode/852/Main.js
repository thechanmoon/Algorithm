/**
 * @param {number[]} arr
 * @return {number}
 */
 var peakIndexInMountainArray = function(arr) {
    let left = 0;
    let right = arr.length -1;
    
    while(left < right)
    {
        
        let mid = left + parseInt((left+right) / 2); 
        
        console.log("before : ", left, right, mid);

        console.log("arr[mid] , arr[mid+1] : ", arr[mid] , arr[mid+1]);

        if(arr[mid] < arr[mid+1])
        {
            left = mid+1;
            // console.log("left : " + left);
        }else{
            right = mid;    
            // console.log("right : " + right);
        }   

        console.log("after : ", left, right, mid);
    }
    return left;
};

console.log(peakIndexInMountainArray([0,1,0]));