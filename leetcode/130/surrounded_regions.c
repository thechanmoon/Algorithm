#include <stdio.h>
#include <stdlib.h>

// =========================
// 좌표 저장 구조체
// =========================
typedef struct {
    int r;
    int c;
} Cell;

// =========================
// DFS (재귀)
// =========================
void dfs(char** board, int r, int c, int rows, int cols) {

    // 범위 체크 + O가 아니면 종료
    if (r < 0 || r >= rows ||
        c < 0 || c >= cols ||
        board[r][c] != 'O') {
        return;
    }

    // 방문 처리
    board[r][c] = '#';

    // 상하좌우 탐색
    dfs(board, r - 1, c, rows, cols);
    dfs(board, r + 1, c, rows, cols);
    dfs(board, r, c - 1, rows, cols);
    dfs(board, r, c + 1, rows, cols);
}

// =========================
// DFS Recursive
// 함수 원형:
// void solve(char** board,
//            int boardSize,
//            int* boardColSize)
// =========================
void solveDFS(char** board,
              int boardSize,
              int* boardColSize) {

    // 예외 처리
    if (board == NULL || boardSize == 0) {
        return;
    }

    int rows = boardSize;
    int cols = boardColSize[0];

    // =========================
    // 1단계: 가장자리 DFS
    // =========================

    // 위 / 아래 행
    for (int c = 0; c < cols; c++) {

        if (board[0][c] == 'O') {
            dfs(board, 0, c, rows, cols);
        }

        if (board[rows - 1][c] == 'O') {
            dfs(board, rows - 1, c, rows, cols);
        }
    }

    // 왼쪽 / 오른쪽 열
    for (int r = 0; r < rows; r++) {

        if (board[r][0] == 'O') {
            dfs(board, r, 0, rows, cols);
        }

        if (board[r][cols - 1] == 'O') {
            dfs(board, r, cols - 1, rows, cols);
        }
    }

    // =========================
    // 2단계: 최종 변환
    // =========================
    for (int r = 0; r < rows; r++) {

        for (int c = 0; c < cols; c++) {

            // 안전 영역 복구
            if (board[r][c] == '#') {
                board[r][c] = 'O';
            }

            // 둘러싸인 영역 제거
            else if (board[r][c] == 'O') {
                board[r][c] = 'X';
            }
        }
    }
}

// =========================
// DFS Stack
// =========================
void solveDFSStack(char** board,
                   int boardSize,
                   int* boardColSize) {

    if (board == NULL || boardSize == 0) {
        return;
    }

    int rows = boardSize;
    int cols = boardColSize[0];

    Cell stack[rows * cols];

    int top = -1;

    int dr[4] = {-1, 1, 0, 0};
    int dc[4] = {0, 0, -1, 1};

    // =========================
    // 1단계: 가장자리 push
    // =========================

    // 위 / 아래 행
    for (int c = 0; c < cols; c++) {

        if (board[0][c] == 'O') {

            board[0][c] = '#';

            stack[++top] = (Cell){0, c};
        }

        if (board[rows - 1][c] == 'O') {

            board[rows - 1][c] = '#';

            stack[++top] = (Cell){rows - 1, c};
        }
    }

    // 왼쪽 / 오른쪽 열
    for (int r = 0; r < rows; r++) {

        if (board[r][0] == 'O') {

            board[r][0] = '#';

            stack[++top] = (Cell){r, 0};
        }

        if (board[r][cols - 1] == 'O') {

            board[r][cols - 1] = '#';

            stack[++top] = (Cell){r, cols - 1};
        }
    }

    // =========================
    // 2단계: DFS Stack
    // =========================
    while (top >= 0) {

        Cell cur = stack[top--];

        for (int i = 0; i < 4; i++) {

            int nr = cur.r + dr[i];
            int nc = cur.c + dc[i];

            if (nr >= 0 && nr < rows &&
                nc >= 0 && nc < cols &&
                board[nr][nc] == 'O') {

                board[nr][nc] = '#';

                stack[++top] = (Cell){nr, nc};
            }
        }
    }

    // =========================
    // 3단계: 최종 변환
    // =========================
    for (int r = 0; r < rows; r++) {

        for (int c = 0; c < cols; c++) {

            if (board[r][c] == '#') {
                board[r][c] = 'O';
            }
            else if (board[r][c] == 'O') {
                board[r][c] = 'X';
            }
        }
    }
}

// =========================
// BFS
// =========================
void solveBFS(char** board,
              int boardSize,
              int* boardColSize) {

    if (board == NULL || boardSize == 0) {
        return;
    }

    int rows = boardSize;
    int cols = boardColSize[0];

    Cell queue[rows * cols];

    int front = 0;
    int rear = 0;

    int dr[4] = {-1, 1, 0, 0};
    int dc[4] = {0, 0, -1, 1};

    // =========================
    // 1단계: 가장자리 Queue 추가
    // =========================

    // 위 / 아래 행
    for (int c = 0; c < cols; c++) {

        if (board[0][c] == 'O') {

            board[0][c] = '#';

            queue[rear++] = (Cell){0, c};
        }

        if (board[rows - 1][c] == 'O') {

            board[rows - 1][c] = '#';

            queue[rear++] = (Cell){rows - 1, c};
        }
    }

    // 왼쪽 / 오른쪽 열
    for (int r = 0; r < rows; r++) {

        if (board[r][0] == 'O') {

            board[r][0] = '#';

            queue[rear++] = (Cell){r, 0};
        }

        if (board[r][cols - 1] == 'O') {

            board[r][cols - 1] = '#';

            queue[rear++] = (Cell){r, cols - 1};
        }
    }

    // =========================
    // 2단계: BFS
    // =========================
    while (front < rear) {

        Cell cur = queue[front++];

        for (int i = 0; i < 4; i++) {

            int nr = cur.r + dr[i];
            int nc = cur.c + dc[i];

            if (nr >= 0 && nr < rows &&
                nc >= 0 && nc < cols &&
                board[nr][nc] == 'O') {

                board[nr][nc] = '#';

                queue[rear++] = (Cell){nr, nc};
            }
        }
    }

    // =========================
    // 3단계: 최종 변환
    // =========================
    for (int r = 0; r < rows; r++) {

        for (int c = 0; c < cols; c++) {

            if (board[r][c] == '#') {
                board[r][c] = 'O';
            }
            else if (board[r][c] == 'O') {
                board[r][c] = 'X';
            }
        }
    }
}

// =========================
// 보드 출력 함수
// =========================
void printBoard(char** board,
                int rows,
                int cols) {

    for (int r = 0; r < rows; r++) {

        for (int c = 0; c < cols; c++) {

            printf("%c ", board[r][c]);
        }

        printf("\n");
    }
}

// =========================
// 보드 복사
// =========================
char** copyBoard(char data[][4],
                 int rows,
                 int cols) {

    char** board = (char**)malloc(rows * sizeof(char*));

    for (int r = 0; r < rows; r++) {

        board[r] = (char*)malloc(cols * sizeof(char));

        for (int c = 0; c < cols; c++) {

            board[r][c] = data[r][c];
        }
    }

    return board;
}

// =========================
// 메모리 해제
// =========================
void freeBoard(char** board,
               int rows) {

    for (int r = 0; r < rows; r++) {
        free(board[r]);
    }

    free(board);
}

// =========================
// main
// =========================
int main() {

    int rows = 4;
    int cols = 4;

    int boardColSize[1] = {cols};

    // 원본 데이터
    char data[4][4] = {
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}
    };

    // =========================
    // DFS Recursive
    // =========================
    char** board1 = copyBoard(data, rows, cols);

    printf("=== DFS Recursive ===\n");

    printf("Before:\n");
    printBoard(board1, rows, cols);

    solveDFS(board1, rows, boardColSize);

    printf("\nAfter:\n");
    printBoard(board1, rows, cols);

    freeBoard(board1, rows);

    // =========================
    // DFS Stack
    // =========================
    char** board2 = copyBoard(data, rows, cols);

    printf("\n=== DFS Stack ===\n");

    printf("Before:\n");
    printBoard(board2, rows, cols);

    solveDFSStack(board2, rows, boardColSize);

    printf("\nAfter:\n");
    printBoard(board2, rows, cols);

    freeBoard(board2, rows);

    // =========================
    // BFS
    // =========================
    char** board3 = copyBoard(data, rows, cols);

    printf("\n=== BFS ===\n");

    printf("Before:\n");
    printBoard(board3, rows, cols);

    solveBFS(board3, rows, boardColSize);

    printf("\nAfter:\n");
    printBoard(board3, rows, cols);

    freeBoard(board3, rows);

    return 0;
}