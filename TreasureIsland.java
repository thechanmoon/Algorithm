import java.util.*;
class Point{
    int r;
    int c;
    Point(int r, int c)
    {
        this.r = r;
        this.c = c;
    }
}
class TreasureIsland{

    byte[][] DIR = {{1,0},{0,1},{-1,0},{0,-1}};
    // public TreasureIsland()
    // {

    // }

    public int minStep(char[][] path)
    {
        int step = 0;
        Queue <Point> q = new ArrayDeque<Point>();
        q.add(new Point(0,0));
        path[0][0] = 'D'; 
        step = 1;
        while(!q.isEmpty())
        {
            Point point = q.poll();
            if(path[point.r][point.c] == 'X')
                return step; 
            path[point.r][point.c] = 'D';           
            if(isSafe(path,point.r, point.c))
            {
                for(int i = 0; i < DIR.length; i++)
                {
                    int r = point.r+DIR[i][0];
                    int c = point.c+DIR[i][1];

                    System.out.println("point.r: " + point.r);
                    System.out.println("point.c: " + point.c);
                    System.out.println("r: " + r);
                    System.out.println("c: " + c);
                    System.out.println("isSafe(path,r,c ): " + isSafe(path,r,c ));
                    // System.out.println("path[r][c]: " + path[r][c]);

                    if(isSafe(path,r,c )&&path[r][c] != 'D')
                    {
                        q.add(new Point(point.r+DIR[i][0],point.c+DIR[i][1]));
                        System.out.println("point added");
                    }else
                    {
                        System.out.println("point not added");
                    }
                }
            }
            System.out.println("size()" + q.size());
            step++;
        }
        return step;
    } 

    boolean isSafe(char[][] path, int r, int c)
    {
        if(r >= 0 && r < path.length && c >=0 && c <path[r].length)
            return true;
        return false;    
    } 
    
}