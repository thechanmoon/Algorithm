/**
 * @param {string[]} products
 * @param {string} searchWord
 * @return {string[][]}
 */
var suggestedProducts = function(products, searchWord) {
    let retList = [];
    products.sort()
    for (let i = 0; i < searchWord.length; i++) {
        let listString = [];
        for (let j = 0; j < products.length; j++) {
            if (listString.length < 3 && i < products[j].length
                    && (products[j].substring(0, i + 1)===(searchWord.substring(0, i + 1)))) {
                listString.push(products[j]);
            }
        }
        // if (listString.size() > 0) {
            retList.push(listString);
        // }
    }
    return retList;
}

// var suggestedProducts = function(products, searchWord) {
//     // products.sort((a,b) => a.localeCompare(b))
//     products.sort()
//     let ans = [], prev
//     for(let i = 0; i < searchWord.length; i++){
//         let sub = [], temp = []
//         let arr = !i ? products : prev
//         for(let j = 0; j < arr.length; j++){
//             if(arr[j][i] === searchWord[i]) {
//                 temp.push(arr[j])
//                 if(sub.length < 3)
//                     sub.push(arr[j])
//             }
//         }
//         ans.push(sub)
//         prev = temp
//     }
//     return ans
// };
console.log(suggestedProducts(["bags","baggage","banner","box","cloths"],"bags"));