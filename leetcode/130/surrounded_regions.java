import java.util.*;

class SurroundedRegions{

    public static void main(String[] args) {
        // 1. 입력 데이터 준비
        char[] [] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        System.out.println("=== 입력 보드 ===");
        printBoard(board);

        // 2. 문제 해결 함수 호출
        // Solution 클래스의 인스턴스를 생성하여 solve 호출
        //new Solution().solve(board);
        new SolutionDFSStack().solve(board);
        //new SolutionBFS().solve(board);

        System.out.println("\n=== 처리 후 보드 ===");
        printBoard(board);
    }

    // 보드를 콘솔에 출력하는 헬퍼 메서드
    private static void printBoard(char[] [] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}

// 문제 해결을 위한 Solution 클래스
class Solution {

    public void solve(char[] [] board) {
        if (board == null || board.length == 0 || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // 1 단계: 보드의 네 가장자리에서 DFS 시작
        // 위와 아래 행
        for (int c = 0; c < cols; c++) {
            if (board[0][c] == 'O') {
                dfs(board, 0, c, rows, cols);
            }
            if (board[rows - 1] [c] == 'O') {
                dfs(board, rows - 1, c, rows, cols);
            }
        }

        // 왼쪽과 오른쪽 열
        for (int r = 0; r < rows; r++) {
            if (board[r][0] == 'O') {
                dfs(board, r, 0, rows, cols);
            }
            if (board[r] [cols - 1] == 'O') {
                dfs(board, r, cols - 1, rows, cols);
            }
        }

        // 2 단계: 보드 전체 순회하며 변환
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r] [c] == '#') {
                    // 안전한 영역 복구
                    board[r] [c] = 'O';
                } else if (board[r] [c] == 'O') {
                    // 둘러싸인 영역은 'X'로 변경
                    board[r] [c] = 'X';
                }
                // 'X'는 그대로 유지
            }
        }
    }

    // DFS 메서드: 'O'를 '#'로 표시하여 연결된 영역 마킹
    // solve 메서드 밖으로 빼서 클래스의 멤버 메서드로 정의
    private void dfs(char[] [] board, int r, int c, int rows, int cols) {
        // 범위 초과 또는 'X' 혹은 이미 방문('#')한 경우 종료
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r] [c] != 'O') {
            return;
        }

        // 현재 셀을 안전한 영역으로 표시
        board[r] [c] = '#';

        // 상하좌우 재귀 호출
        dfs(board, r - 1, c, rows, cols);  // 상
        dfs(board, r + 1, c, rows, cols);  // 하
        dfs(board, r, c - 1, rows, cols);  // 좌
        dfs(board, r, c + 1, rows, cols);  // 우
    }
}

class SolutionDFSStack {

    public void solve(char[][] board) {

        // 예외 처리
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // DFS용 Stack
        Stack<int[]> stack = new Stack<>();

        // 상하좌우 방향
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 1단계: 가장자리 O 탐색 후 Stack에 추가

        // 위쪽 / 아래쪽 행
        for (int c = 0; c < cols; c++) {

            if (board[0][c] == 'O') {
                board[0][c] = '#';
                stack.push(new int[]{0, c});
            }

            if (board[rows - 1][c] == 'O') {
                board[rows - 1][c] = '#';
                stack.push(new int[]{rows - 1, c});
            }
        }

        // 왼쪽 / 오른쪽 열
        for (int r = 0; r < rows; r++) {

            if (board[r][0] == 'O') {
                board[r][0] = '#';
                stack.push(new int[]{r, 0});
            }

            if (board[r][cols - 1] == 'O') {
                board[r][cols - 1] = '#';
                stack.push(new int[]{r, cols - 1});
            }
        }

        // 2단계: DFS(Stack)
        while (!stack.isEmpty()) {

            int[] cell = stack.pop();

            int r = cell[0];
            int c = cell[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                // 범위 체크 + 방문 안한 O
                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    board[nr][nc] == 'O') {

                    // 방문 처리
                    board[nr][nc] = '#';

                    stack.push(new int[]{nr, nc});
                }
            }
        }

        // 3단계: 최종 변환
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (board[r][c] == '#') {
                    board[r][c] = 'O';
                } else if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                }
            }
        }
    }
}

class SolutionBFS {

    public void solve(char[][] board) {

        // 예외 처리
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // 상하좌우 방향
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 1단계: 가장자리의 O를 Queue에 넣고 즉시 방문 처리

        // 위쪽 / 아래쪽 행
        for (int c = 0; c < cols; c++) {

            if (board[0][c] == 'O') {
                board[0][c] = '#';
                queue.offer(new int[]{0, c});
            }

            if (board[rows - 1][c] == 'O') {
                board[rows - 1][c] = '#';
                queue.offer(new int[]{rows - 1, c});
            }
        }

        // 왼쪽 / 오른쪽 열
        for (int r = 0; r < rows; r++) {

            if (board[r][0] == 'O') {
                board[r][0] = '#';
                queue.offer(new int[]{r, 0});
            }

            if (board[r][cols - 1] == 'O') {
                board[r][cols - 1] = '#';
                queue.offer(new int[]{r, cols - 1});
            }
        }

        // 2단계: BFS
        while (!queue.isEmpty()) {

            int[] cell = queue.poll();

            int r = cell[0];
            int c = cell[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                // 범위 체크 + 방문 안한 O
                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    board[nr][nc] == 'O') {

                    // Queue 넣기 전에 즉시 방문 처리
                    board[nr][nc] = '#';

                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        // 3단계: 최종 변환
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (board[r][c] == '#') {
                    board[r][c] = 'O';
                } else if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                }
            }
        }
    }
}