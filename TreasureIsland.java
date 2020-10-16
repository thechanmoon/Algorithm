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

    static byte[][] DIR = {{1,0},{0,1},{-1,0},{0,-1}};
    // public TreasureIsland()
    // {

    // }

    public static int minStep(char[][] path)
    {
        int step = 0;
        Queue <Point> q = new ArrayDeque<Point>();
        q.add(new Point(0,0));
        path[0][0] = 'D'; 
        while(!q.isEmpty())
        {
            Point point = q.poll();

            if(isSafe(path,point.r,point.c ) && path[point.r][point.c] == 'X')
                return step;     

            if(isSafe(path,point.r, point.c))
            {
                for(int i = 0; i < DIR.length; i++)
                {
                    int r = point.r+DIR[i][0];
                    int c = point.c+DIR[i][1];



                    // System.out.println("path[r][c]: " + path[r][c]);

                    if(isSafe(path,r,c )&&path[r][c] != 'D')
                    {
                        System.out.println("point.r: " + point.r);
                        System.out.println("point.c: " + point.c);
                        System.out.println("r: " + r);
                        System.out.println("c: " + c);
                        // System.out.println("isSafe(path,r,c ): " + isSafe(path,r,c ));

                        q.add(new Point(r,c));
                        path[r][c] = 'D';
                        System.out.println("point added");
                        System.out.println(step + "============");
                    }else
                    {
                        // System.out.println("point not added");
                    }
                }
            }
            // System.out.println("size()" + q.size());
            step++;
        }
        return step;
    } 

    static boolean isSafe(char[][] path, int r, int c)
    {
        if(r >= 0 && r < path.length && c >=0 && c <path[r].length)
            return true;
        return false;    
    } 
    
       public static void main(String[] args) {
        // boolean[][] grid = { { false, false, false, false }, { false, false, false,
        // true },
        // { true, true, false, false }, { false, false, false, false } };
        // Robot robot = new Robot();
        // ArrayList<Point> path = robot.findPath(grid);
        // if (path != null) {
        // for (Point p : path) {
        // System.out.print(p.row + "" + p.col + " -> ");
        // }
        // }
        
        // System.out.println("Test");
        // int[] arr = { 3, 5, 4, 2, 1 };

        // BubbleSort bs = new BubbleSort(arr);

        // for (int n : bs.sort()) {
        //     System.out.println(n);
        // }

        // for (int n : BubbleSort.sort(arr)) {
        // System.out.println(n);
        // }
       char[][] path =  
        {{'O', 'O', 'O', 'O'},
        {'D', 'O', 'D', 'O'},
        {'O', 'O', 'O', 'O'},
        {'X', 'D', 'D', 'O'}} ;
        System.out.println(minStep(path)+" ");
        // System.out.println(ts.isSafe(path,0,4));
        
    }
}