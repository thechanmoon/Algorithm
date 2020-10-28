// var countRoutes = function(locations, start, finish, fuel) {
//     const memo = new Array(locations.length+1).fill(0).map(()=>new Array(201).fill(-1));  
//     const dfs = function(cur, f){
//         if(f<0) return 0;
//         if(memo[cur][f]!=-1) return memo[cur][f];
//         let res = (cur==finish);
//         for(let i in locations){
//             if(i==cur) continue;
//             res = (res + dfs(i, f-Math.abs(locations[i]-locations[cur])))%1000000007;
//         }
//         return memo[cur][f]=res;
//     }
    
//     return dfs(start, fuel);
// };

// const countRoutes = ( locations, start, finish, fuel ) => {
//     const mod = 10**9 + 7
//     const temp = Array.from( { length: locations.length }, () => Array( fuel + 1 ).fill(0) )
//     // const test = Array.from( { length: locations.length });
//     // console.log(test.length);
//     console.log(temp);
//     temp[start][0] = 1
    
//     for ( let j = 0; j <= fuel; j++ ) {
//         for ( let i = 0; i < locations.length; i++ ) {
//             if ( ! temp[ i ][ j ] )
//             { 
//                 continue
//             }
//             for ( let k = 0; k < locations.length; k++ ) {
//                 if ( i == k )
//                 { 
//                     continue
//                 }
//                 let tot = j + Math.abs( locations[ k ] - locations[ i ] )
//                 if ( tot <= fuel ) {
//                     temp[ k ][ tot ] += temp[ i ][ j ] % mod
//                 }
//             }
//         }
//     }
    
//     // console.log(temp[finish]);
//     return temp[ finish ].reduce( ( a, x ) => (a + x) % mod )
// }



const countRoutes = function (locations, start, finish, fuel) {
    const num = locations.length
    const temp = Array.from({ length: num }, () => Array(fuel + 1).fill(-1))
    return dfs(temp, start, finish, fuel)
}

const mod = 10 ** 9 + 7;

const dfs = (temp,cur, end, fuel) => {
    if (fuel < 0) 
        return 0
    if (temp[cur][fuel] !== -1) 
        return temp[cur][fuel]
    let retVal = cur === end ? 1 : 0
    for (let next = 0; next < locations.length; next++) {
        if (next !== cur) {
            retVal += dfs(temp, next, end, fuel - Math.abs(locations[cur] - locations[next])) % mod
        }
    }
    return (temp[cur][fuel] = retVal % mod)
}

let locations = [ 2, 3, 6, 8, 4 ];
let start = 1;
let finish = 3;
let fuel = 5;

console.log(countRoutes(locations,start,finish,fuel));