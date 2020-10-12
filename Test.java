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
        int[] arr = { 3, 5, 4, 2, 1 };

        BubbleSort bs = new BubbleSort(arr);

        for (int n : bs.sort()) {
            System.out.println(n);
        }

        // for (int n : BubbleSort.sort(arr)) {
        // System.out.println(n);
        // }
    }
}