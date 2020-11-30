var arrayStringsAreEqual = function(word1, word2) {
    //     let sb1;
    //     let sb2;
    
    //     for(let i = 0; i < word1.length || i < word2.length; i++)
    //     {
    //         if(i< word1.length)
    //         {
    //           sb1 += (word1[i]);  
    //         }
    
    //         if(i< word2.length)
    //         {
    //           sb2 += (word2[i]);  
    //         }
    //     }
    
    //     return sb1 === sb2;
        return word1.join('') === word2.join('')
    };