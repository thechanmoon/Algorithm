function findPlatform(arr, dep, n){
    let max = 1, current = 1, i = 1, j = 0;

    // console.log(arr);
    // console.log(dep);

    arr.sort((a,b)=>a-b);
    dep.sort((a,b)=>a-b);

    // console.log(arr);
    // console.log(dep);
    
    while(i < n && j < n){
        if(arr[i] <= dep[j]){
            current++;
            i++;
        }else if(arr[i] > dep[j]){
            current--;
            j++
        }
        max = Math.max(max,current);
    }
    
    return max;
}

let arr = new Array(900, 940, 950, 1100, 1500, 1800);
let dep = new Array(910, 1200, 1120, 1130, 1900, 2000);
let n = arr.length;
console.log("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n))