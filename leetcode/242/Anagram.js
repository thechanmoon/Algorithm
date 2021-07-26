/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
 var isAnagram = function(s, t) {
    if(s.length != t.length)
        return false;

    // return s.split('').sort().join() === t.split('').sort().join();
    // return [...s].sort().join() === [...t].sort().join();
    // return Array.from(s).sort().join() === Array.from(t).sort().join();
    // return Object.assign([],s).sort().join() === Object.assign([],t).sort().join();

    // const table = {};
    // let table = new Map();
    const table = new Map();
    for(let i = 0; i < s.length; i++){
        table[s[i]] = table[s[i]] ? ++(table[s[i]]) : 1;
        table[t[i]] = table[t[i]] ? --(table[t[i]]) : -1;
    }

    console.log(table);

    //for(let c in table){
        // console.log(c);
        // console.log(table[c]);
        // console.log(table[c]==0);
        // console.log(table[c]<0);
        // console.log('========');
    //    if(table[c] < 0)
    //        return false;
    //}

    // for (const [key, value] of Object.entries(table)) {
        // console.log(key,value);
        // if(value < 0)
        //    return false;
    // }

    var iterator_obj = table.entries();

    var value = iterator_obj.next().value;
    console.log(iterator_obj); 
    while (value) {  
        console.log(value);  
        if(value < 0)
            return false;

        value = iterator_obj.next().value;
    }
    return true;
}
// console.log(isAnagram("anagram","nagaram"));
console.log(isAnagram("rat","car"));