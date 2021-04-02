using namespace std;

#include <iostream>

class Solution {
public:
    bool judgeCircle(string moves) {
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < moves.length(); i++)
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
};

int main() {
    Solution sl;
    sl.judgeCircle("UD")? std::cout << "true\n": std::cout << "flase\n";   
 return 0;
}