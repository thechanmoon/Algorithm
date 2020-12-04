var Sqrt = function(x) {
    let l = 0;
    let r = x;
    
    while(l <= r) {
      const mid = Math.floor((l + r) / 2);
      
      if (mid**2 === x) {
        return mid;
      } else if (mid**2 > x) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    
    return r;
  };

  console.log(Sqrt(10));