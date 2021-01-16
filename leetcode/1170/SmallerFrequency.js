/**
 * @param {string[]} queries
 * @param {string[]} words
 * @return {number[]}
 */
var numSmallerByFrequency = function(queries, words) {

    let ans = [];

    let qr = [];
    let wor = [];


    for (let i = 0; i < queries.length; i++) {
        qr[i] = getMinQuery(queries[i]);
    }

    for (let i = 0; i < words.length; i++) {
        wor[i] = getMinQuery(words[i]);
    }

    for (let i = 0; i < qr.length; i++) {

        let count = 0;
        for (let j = 0; j < wor.length; j++) {

            if (qr[i] < wor[j]) {
                count++;
            }
        }

        ans[i] = count;
    }

    return ans;
};

var getMinQuery = function(s) {

    let charAr = [...s];
    charAr.sort();

    let minLenQuery = 1;

    for (var i = 1; i < charAr.length; i++) {
        if (charAr[0] == charAr[i]) {
            minLenQuery++;
        }

    }
    return minLenQuery;
}