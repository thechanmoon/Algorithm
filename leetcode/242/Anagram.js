/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
 var isAnagram = function(s, t) {
    // if(s.length != t.length)
    //     return false;
    
   // return s.split('').sort().join() === t.split('').sort().join();
   // return [...s].sort().join() === [...t].sort().join();
   // return Array.from(s).sort().join() === Array.from(t).sort().join();
   return Object.assign([],s).sort().join() === Object.assign([],t).sort().join();
};

console.log(isAnagram("anagram","nagaram"));