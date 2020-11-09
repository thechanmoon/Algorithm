import java.util.*;

class Test {
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
        // char[][] path =
        // {{'O', 'O', 'O', 'O'},
        // {'D', 'O', 'D', 'O'},
        // {'O', 'O', 'O', 'O'},
        // {'X', 'D', 'D', 'O'}} ;

        // TreasureIsland ts = new TreasureIsland();
        // System.out.println(ts.minStep(path)+" ");
        // System.out.println(ts.isSafe(path,0,4));

        // CompressString sl = new CompressString();
        // String str = sl.compressString("testtest");
        // System.out.println(str);

        // str = sl.compressString("aaaaabbbbbeeeehhh");
        // System.out.println(str);

        Palindrome pd = new Palindrome();
        // System.out.println(pd.isPermutationOfPalidrome("taco caT"));
        System.out.println(pd.isPalidrome("taco caT"));
        System.out.println(pd.isPalidrome("taco cat"));

    }
}