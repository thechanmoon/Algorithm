var lengthOfLastWord = function(s) {
    // let array = s.split(" ").filter(s=>s !=='');
    // if(array === undefined || array.length == 0)
    //     return 0;
    // return array[array.length-1].length;
    
    let counter = 0;
    for (let i = s.length - 1; i >= 0; i--) {
        if (s[i] != ' ') {
            counter++;
        } else if (s[i] == ' ' && counter > 0) {
            break;
        }
    }
    return counter;
};

var lengthOfLastWord = function(s) {
    return s.trim().split(' ').pop().length;
    // return s.trim().split(' ').slice(-1)[0].length
}
console.log(lengthOfLastWord('Hello World'));