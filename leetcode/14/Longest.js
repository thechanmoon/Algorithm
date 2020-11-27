// var longestCommonPrefix = function(strs) {
//     if (strs.length === 0) return '';
//     let r = '';
//     for (let i = 0; i < strs[0].length; i++) {
//       for (let j = 1; j < strs.length; j++) {
//         if (strs[0][i] !== strs[j][i]) return r;
//       }
//       r += strs[0][i];
//     }
//     return r;
//   };



  var longestCommonPrefix = function(strs) {
  
    if( strs.length === 0)
        return '';

    let prefix = strs[0];
    console.log('strs.length : ',strs.length); 
    console.log(1,prefix);  
    for(let i = 0; i < strs.length; i++)
    {
      console.log(2,prefix);  
      while(strs[i].indexOf(prefix) !==0)
        {
          console.log(3,prefix);    
          prefix = prefix.substring(0,prefix.length -1);
          console.log(4,prefix);  
            if (prefix == null) return '';
        }
    }
    
    return prefix;
};

console.log(longestCommonPrefix([]));