var judgeCircle = function(moves) {
    let x = 0;
    let y = 0;
    
    let array = moves.split('');
    
    for(let i = 0; i < array.length; i++)
    {
       if(array[i] == 'R')
           x++;    
       else if(array[i] == 'L')
           x--;
       else if(array[i] == 'U')
           y++;    
       else if(array[i] == 'D')
           y--;
    }
    return (x == 0 && y == 0);
};

console.log(judgeCircle("UD"));