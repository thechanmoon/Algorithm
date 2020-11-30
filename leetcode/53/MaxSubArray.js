var maxSubArray = function(nums) {
    let sum = nums[0];
    for (let i = 1; i < nums.length; i++) {
        console.log("nums["+i+"] = "+nums[i]);
        console.log("nums["+(i-1)+"] = "+nums[i-1]);

        if (nums[i - 1] > 0) {
            console.log("nums["+i+"] += nums["+(i - 1)+"] = "+(nums[i] + nums[i - 1]));
            nums[i] += nums[i - 1];
        }
        
        console.log(nums);
        console.log("before max nums["+i+"] = "+nums[i],"sum : " + sum);
        sum = Math.max(nums[i], sum);
        console.log("after max nums["+i+"] = "+nums[i],"sum : " + sum);
        console.log("========");
        // sum = nums[i] > sum ? nums[i] : sum
    }
    return sum;
};
console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]));

/* 
nums[1] = 1
nums[0] = -2
[
  -2, 1, -3, 4, -1,
   2, 1, -5, 4
]
before max nums[1] = 1 sum : -2
after max nums[1] = 1 sum : 1
========
nums[2] = -3
nums[1] = 1
nums[2] += nums[1] = -2
[
  -2, 1, -2, 4, -1,
   2, 1, -5, 4
]
before max nums[2] = -2 sum : 1
after max nums[2] = -2 sum : 1
========
nums[3] = 4
nums[2] = -2
[
  -2, 1, -2, 4, -1,
   2, 1, -5, 4
]
before max nums[3] = 4 sum : 1
after max nums[3] = 4 sum : 4
========
nums[4] = -1
nums[3] = 4
nums[4] += nums[3] = 3
[
  -2, 1, -2, 4, 3,
   2, 1, -5, 4
]
before max nums[4] = 3 sum : 4
after max nums[4] = 3 sum : 4
========
nums[5] = 2
nums[4] = 3
nums[5] += nums[4] = 5
[
  -2, 1, -2, 4, 3,
   5, 1, -5, 4
]
before max nums[5] = 5 sum : 4
after max nums[5] = 5 sum : 5
========
nums[6] = 1
nums[5] = 5
nums[6] += nums[5] = 6
[
  -2, 1, -2, 4, 3,
   5, 6, -5, 4
]
before max nums[6] = 6 sum : 5
after max nums[6] = 6 sum : 6
========
nums[7] = -5
nums[6] = 6
nums[7] += nums[6] = 1
[
  -2, 1, -2, 4, 3,
   5, 6,  1, 4
]
before max nums[7] = 1 sum : 6
after max nums[7] = 1 sum : 6
========
nums[8] = 4
nums[7] = 1
nums[8] += nums[7] = 5
[
  -2, 1, -2, 4, 3,
   5, 6,  1, 5
]
before max nums[8] = 5 sum : 6
after max nums[8] = 5 sum : 6
========
6
*/