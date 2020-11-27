let hashmap = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000};     

let max = 0;
let total = 0;
let value = 0;

for(let i = s.length-1; i > -1; i--)
{
    value = hashmap[s[i]];

    if(value < max)
    {
        total -= value;
    }else
    {
        total += value;
        max = value;
    }
}
return total;