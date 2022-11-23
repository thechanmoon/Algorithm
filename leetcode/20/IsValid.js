let isValid = function(s) {
    let map=new Map();
    map.set('{','}');
    map.set('(',')');
    map.set('[',']');
    let b=[];
    for(let i=0;i<s.length;i++){
        if(map.has(s.charAt(i))){
            b.push(s.charAt(i));
            console.log("b: " + b, "s.charAt(i) : " + s.charAt(i));
        }
        else{
            let pop=b.pop();
            console.log("b.pop(): " + pop, "s.charAt(i) : " + s.charAt(i));
            if(map.get(pop)!==s.charAt(i)){
                return false;
            }
        }
    }
    return !b.length;
};

const isValid2 = (string) => {
    console.log(string)
    const dataBrackets = {
        '}': '{',
        ']': '[',
        ')': '('
    }
    let stack = []
    for(let i = 0; i< string.length; i++){
        let bracket = string[i] 
        console.log(string[i], `character at ${i} index outside if`)
        // if(dataBrackets[bracket] === bracket){ // if string[i] is a closing bracket 
        if(bracket === `}`|| bracket === `]`|| bracket === `)`){ // if string[i] is a closing bracket 
            console.log(bracket, `bracket is a closing bracket`)
            console.log(stack, 'stack')
            const stackPop = stack === [] ? '#' : stack.pop() // eliminate last item
            console.log(stack, 'stack')
            if(stackPop !== dataBrackets[bracket]){ // if 
                return false
            }
        } else { // if string[i] is a opening bracket
            stack.push(bracket) // add last item
        }
    }
    if(stack.length !== 0)
        return false
    return true
}

//console.log(isValid('()[]{}'));
//console.log(isValid2('()[]{}'));
console.log(isValid('(['));