function duplicates(nums, n) {
    // code here
    // System.out.println("arr.size(): " + arr.length);
    // System.out.println("n: " + n);
    // HashMap <Integer,Boolean> hashmap = new HashMap<>();
    let list = [];
    for(let i = 0; i < n; i++)
    {                
        let index = Math.abs(nums[i]);
        if(nums[index] < 0 && !list.includes(index))
        {
            list.push(index);
        }else
        {
            nums[index] = -nums[index];
        }
    }
    if(list.length==0)
    {
        list.push(-1);
    }else
    {
        list.sort(function(a, b) {
            return a - b;
          });
    }
    return list;
}

function printRepeating(arr, size) {
    let i;
    let list = [];
    console.log("The repeating elements are : ");

    for (i = 0; i < size; i++) {
        if (arr[Math.abs(arr[i])] >= 0)
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        else
        {
            //console.log(Math.abs(arr[i]) + " ");
            list.push(Math.abs(arr[i]))
        }
    }

    if(list.length==0)
    {
        list.push(-1);
    }else
    {
        list.sort(function(a, b) {
            return a - b;
          });
    }
    return list;
}


let a = [17,27,11,23,14,29,17,24,3,6,18,8,18,16,29,11,24,5,0,1,28,3,28,4,13,7,7,27,10,21];    
let aa = [17, 27, 11, 23, 14, 29, 17, 24, 3, 6, 18, 8, 18, 16, 29, 11, 24, 5, 0, 1, 28, 3, 28, 4, 13, 7, 7,
        27, 10, 21];

console.log(duplicates(a, a.length));
console.log(printRepeating(aa,aa.length));