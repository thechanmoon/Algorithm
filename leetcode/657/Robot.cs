using System;

public class Robot
{
    public static void Main(string[] args)
    {
        Solution sl = new Solution();
        Console.WriteLine (sl.JudgeCircle("UD"));
    }
}

public class Solution {
    public bool JudgeCircle(string moves) {
        int x = 0;
        int y = 0;
        
        char[] array = moves.ToCharArray();
        
        for(int i = 0; i < array.Length; i++)
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