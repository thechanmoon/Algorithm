const isPalindrome = (str) => 
{
    const charCount = {} 

    for (let i = 0; i < str.length; i++) {    
        char = str[i].toLowerCase();   
        if((char.charCodeAt() & 255) < ('a'.charCodeAt() & 255) || (char.charCodeAt() & 255)> ('z'.charCodeAt() & 255))
            continue;

        charCount[char] = (charCount[char] || 0) + 1 
    }

    const counts = Object.values(charCount); 

    let oddCounts = 0; 
    for (let i = 0; i < counts.length; i++) { 
        if (counts[i] % 2 != 0) { 
            oddCounts++;
        }

        if (oddCounts > 1) { 
            return false;
        }
    }
    return true; 
}

const isPalindromeShort = (str) => 
{
    const charCount = {} 
    let oddCounts = 0; 

    for (let i = 0; i < str.length; i++) { 

        char = str[i].toLowerCase();   
        if((char.charCodeAt() & 255) < ('a'.charCodeAt() & 255) || (char.charCodeAt() & 255)> ('z'.charCodeAt() & 255))
            continue;
        
        charCount[char] = (charCount[char] || 0) + 1 

        if (charCount[char] % 2 == 1) { 
            oddCounts++;
        }else
        {
            oddCounts--;
        }
    }
    return (oddCounts <= 1); 
}

console.log(isPalindromeShort("test"));
console.log(isPalindromeShort("tenet"));
console.log(isPalindromeShort("Taco cat"));

console.log(isPalindrome("test"));
console.log(isPalindrome("tenet"));
console.log(isPalindrome("taco caT"));