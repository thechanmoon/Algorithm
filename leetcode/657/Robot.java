class Robot
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.judgeCircle("UD"));
    }
}
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        char[] array = moves.toCharArray();
        
        for(int i = 0; i < array.length; i++)
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
    }
}