const array = [2,3,4,5];

let ret = array.map(element =>  {return element*2});

console.log(ret);

const array1 = [1, 4, 9, 16];

// pass a function to map
const map1 = array1.map(x => x * 2);

console.log(map1);
// expected output: Array [2, 8, 18, 32]