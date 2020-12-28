/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    let result = [];
    
    for(let i = 0; i <= rowIndex; i++)
    {  
        result[i] = [];
        for(let j = 0; j < i+1; j++)
        {
            if(j===0||j=== i)
            {
                result[i][j] = 1;
            }else
            {
                //console.log(i,j,i-1,j-1);
                
                result[i][j] = result[i-1][j-1] + result[i-1][j];
                //console.log(result[i][j]);
            }
        }
    }
    return result[rowIndex];
};