function minRope(arr){
    return arr.sort((a,b) => a-b).reduce((acc, n, i) => {
      if(i == 0) {acc.prev = n; return acc; }; 
      const sum = acc.prev + n;
      acc.prev = sum;
      acc.total += sum;
      return acc;
    }, {prev: 0, total: 0}).total;
  };



  let files1 = [8, 4, 6, 12];
  let files2 = [20, 4, 8, 2];
  let files3 = [1, 2, 5, 10,35, 89];
  let files4 = [2, 2, 3, 3];
  console.log(minRope(files1));
  console.log(minRope(files2));
  console.log(minRope(files3));
  console.log(minRope(files4));