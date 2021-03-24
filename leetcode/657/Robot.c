#include <stdio.h>
#include <string.h>
#include <stdbool.h>
bool judgeCircle(char * moves){
    
    int length = strlen(moves);
    
    int x = 0;
    int y = 0;
    int i = 0;
    
    for(i = 0; i < length; i++)
    {
        if(moves[i] == 'R')
            x++;    
        else if(moves[i] == 'L')
            x--;
        else if(moves[i] == 'U')
            y++;    
        else if(moves[i] == 'D')
            y--;
    }
    return (x == 0 && y == 0);
}

int main() {
 printf(judgeCircle("UD")?"true\n":"false\n");   
 return 0;
}