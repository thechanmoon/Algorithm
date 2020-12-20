/**
 * @param {number} numRows
 * @return {number[][]}
 */
// let generate = function(numRows) {
//     let final=[];
//     for(let i=0;i<numRows;i++){
//         final[i]=[];
//         final[i][0]=final[i][i]=1;
//         for(let j=1;j<i;j++){
//             final[i][j]=final[i-1][j]+final[i-1][j-1];
//         }
//     }
//     return final;
// };

// var generate = function(numRows) {
//     let ret = [];
    
//     for(let i = 0; i < numRows; i++)
//     {
//         ret[i] = [];
//         ret[i][0] = ret[i][i] = 1;
//         for(let j = 1; j < i; j++)
//         {
//                ret[i][j] = ret[i-1][j] + ret[i-1][j-1]; 
//         }
//     }
//     return ret;
// };

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let result = [];
    
    for(let i = 0; i < numRows; i++)
    {  
        result[i] = [];
        for(let j = 0; j < i+1; j++)
        {
            if(j===0||j=== i)
            {
                result[i][j] = 1;
            }else
            {
                console.log(i,j,i-1,j-1);
                
                result[i][j] = result[i-1][j-1] + result[i-1][j];
                console.log(result[i][j]);
            }
        }
    }
    return result;
};

console.log(generate(5));