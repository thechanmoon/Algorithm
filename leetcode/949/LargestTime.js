/**
 * @param {number[]} arr
 * @return {string}
 */
var largestTimeFromDigits = function(A) {
    const times = permutation(A)
      .filter(a => ((a[0] === 2 && a[1] < 4) || a[0] < 2) && a[2] < 6) // only keep valid times
      .map(a => 60 * (a[0] * 10 + a[1]) + a[2] * 10 + a[3]); // convert to minutes
    return times.length ? convert(Math.max(...times)) : '';
  };
  
  // convert minutes back to time
  const convert = time => {
    const m = time % 60;
    const m2 = m % 10;
    const m1 = (m - m2) / 10;
    const h = (time - m) / 60;
    const h2 = h % 10;
    const h1 = (h - h2) / 10;
    return `${h1}${h2}:${m1}${m2}`;
  };
  
  // Heap's algorithm to generate permutations
  const permutation = arr => {
    const generate = (arr, n) => {
      if (n == 1) {
        result.push(arr.slice());
        return;
      }
      for (var i = 0; i < n; i++) {
        generate(arr, n - 1);
        if (n % 2 === 0) {
          [arr[i], arr[n - 1]] = [arr[n - 1], arr[i]];
        } else {
          [arr[0], arr[n - 1]] = [arr[n - 1], arr[0]];
        }
      }
    };
    const result = [];
    generate(arr, arr.length);
    return result;
  };

  console.log(largestTimeFromDigits([1,1,1,1]));
  console.log(largestTimeFromDigits([1,2,3,4]));
  console.log(largestTimeFromDigits([5,5,5,5]));
  console.log(largestTimeFromDigits([0,0,1,0]));
  console.log(largestTimeFromDigits([0,0,0,0]));