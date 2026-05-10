from collections import deque


# =========================
# 출력 헬퍼
# =========================
def print_board(board):
    for row in board:
        print(row)

# =========================
# DFS (재귀 버전 Class Method)
# =========================
class Solution:
    def solve(self, board):

        # =========================
        # 0. 예외 처리
        # =========================
        if not board or not board[0]:
            return

        rows, cols = len(board), len(board[0])

        # =========================
        # 1. 가장자리에서 DFS 시작
        # =========================

        # 위 / 아래 행
        for c in range(cols):
            if board[0][c] == 'O':
                self.dfs(board, 0, c, rows, cols)
            if board[rows - 1][c] == 'O':
                self.dfs(board, rows - 1, c, rows, cols)

        # 왼쪽 / 오른쪽 열
        for r in range(rows):
            if board[r][0] == 'O':
                self.dfs(board, r, 0, rows, cols)
            if board[r][cols - 1] == 'O':
                self.dfs(board, r, cols - 1, rows, cols)

        # =========================
        # 2. 최종 변환 단계
        # =========================
        for r in range(rows):
            for c in range(cols):

                # '#' → 안전 영역 복구
                if board[r][c] == '#':
                    board[r][c] = 'O'

                # 남은 'O' → 둘러싸인 영역
                elif board[r][c] == 'O':
                    board[r][c] = 'X'

    # =========================
    # DFS (클래스 메서드)
    # =========================
    def dfs(self, board, r, c, rows, cols):

        # 범위를 벗어나거나 'O'가 아니면 종료
        if r < 0 or r >= rows or c < 0 or c >= cols or board[r][c] != 'O':
            return

        # 현재 위치를 안전 영역으로 표시
        board[r][c] = '#'

        # 4방향 탐색
        self.dfs(board, r - 1, c, rows, cols)  # 상
        self.dfs(board, r + 1, c, rows, cols)  # 하
        self.dfs(board, r, c - 1, rows, cols)  # 좌
        self.dfs(board, r, c + 1, rows, cols)  # 우

# =========================
# DFS (재귀 버전 Nested Fuction)
# =========================
class SolutionNested:
    def solve(self, board):

        # =========================
        # 0. 예외 처리
        # =========================
        if not board or not board[0]:
            return

        rows, cols = len(board), len(board[0])

        # =========================
        # DFS 함수 (재귀)
        # =========================
        def dfs(r, c):
            # 범위를 벗어나거나 'O'가 아니면 종료
            if r < 0 or r >= rows or c < 0 or c >= cols or board[r][c] != 'O':
                return

            # 현재 위치를 안전 영역으로 표시
            board[r][c] = '#'

            # 4방향 탐색 (상 / 하 / 좌 / 우)
            dfs(r - 1, c)  # 상
            dfs(r + 1, c)  # 하
            dfs(r, c - 1)  # 좌
            dfs(r, c + 1)  # 우

        # =========================
        # 1. 가장자리에서 DFS 시작
        # =========================

        # 위 / 아래 행 처리
        for c in range(cols):
            if board[0][c] == 'O':
                dfs(0, c)
            if board[rows - 1][c] == 'O':
                dfs(rows - 1, c)

        # 왼쪽 / 오른쪽 열 처리
        for r in range(rows):
            if board[r][0] == 'O':
                dfs(r, 0)
            if board[r][cols - 1] == 'O':
                dfs(r, cols - 1)

        # =========================
        # 2. 최종 변환 단계
        # =========================
        for r in range(rows):
            for c in range(cols):

                # '#' → 원래 안전 영역이므로 복구
                if board[r][c] == '#':
                    board[r][c] = 'O'

                # 남은 'O' → 둘러싸인 영역이므로 'X'로 변경
                elif board[r][c] == 'O':
                    board[r][c] = 'X'

# =========================
# DFS Stack (반복문 버전)
# =========================
class SolutionDFSStack:
    def solve(self, board):
        # 예외 처리
        if not board or not board[0]:
            return

        rows, cols = len(board), len(board[0])

        # stack (DFS 구현용)
        stack = []

        # 4방향 이동 배열
        dr = [-1, 1, 0, 0]  # 상, 하
        dc = [0, 0, -1, 1]  # 좌, 우

        # =========================
        # 1단계: 가장자리 O push
        # =========================

        for c in range(cols):
            if board[0][c] == 'O':
                board[0][c] = '#'
                stack.append((0, c))

            if board[rows - 1][c] == 'O':
                board[rows - 1][c] = '#'
                stack.append((rows - 1, c))

        for r in range(rows):
            if board[r][0] == 'O':
                board[r][0] = '#'
                stack.append((r, 0))

            if board[r][cols - 1] == 'O':
                board[r][cols - 1] = '#'
                stack.append((r, cols - 1))

        # =========================
        # 2단계: DFS 수행 (stack)
        # =========================
        while stack:

            # 마지막 요소 pop (LIFO → DFS)
            r, c = stack.pop()

            # 4방향 탐색
            for i in range(4):
                nr = r + dr[i]
                nc = c + dc[i]

                # 범위 체크 + 아직 방문 안한 O
                if 0 <= nr < rows and 0 <= nc < cols and board[nr][nc] == 'O':

                    # 방문 처리 (중복 방지 핵심)
                    board[nr][nc] = '#'

                    stack.append((nr, nc))

        # =========================
        # 3단계: 최종 변환
        # =========================
        for r in range(rows):
            for c in range(cols):

                if board[r][c] == '#':
                    board[r][c] = 'O'

                elif board[r][c] == 'O':
                    board[r][c] = 'X'


# =========================
# BFS (Queue 버전)
# =========================
class SolutionBFS:
    def solve(self, board):
        # 예외 처리
        if not board or not board[0]:
            return

        rows, cols = len(board), len(board[0])

        # queue (BFS용)
        q = deque()

        # 4방향 이동
        dr = [-1, 1, 0, 0]
        dc = [0, 0, -1, 1]

        # =========================
        # 1단계: 가장자리 O push
        # =========================

        for c in range(cols):
            if board[0][c] == 'O':
                board[0][c] = '#'
                q.append((0, c))

            if board[rows - 1][c] == 'O':
                board[rows - 1][c] = '#'
                q.append((rows - 1, c))

        for r in range(rows):
            if board[r][0] == 'O':
                board[r][0] = '#'
                q.append((r, 0))

            if board[r][cols - 1] == 'O':
                board[r][cols - 1] = '#'
                q.append((r, cols - 1))

        # =========================
        # 2단계: BFS 수행
        # =========================
        while q:

            # FIFO → BFS
            r, c = q.popleft()

            for i in range(4):
                nr = r + dr[i]
                nc = c + dc[i]

                # 범위 체크 + 방문 안한 O
                if 0 <= nr < rows and 0 <= nc < cols and board[nr][nc] == 'O':

                    # 방문 처리 (중복 enqueue 방지)
                    board[nr][nc] = '#'

                    q.append((nr, nc))

        # =========================
        # 3단계: 최종 변환
        # =========================
        for r in range(rows):
            for c in range(cols):

                if board[r][c] == '#':
                    board[r][c] = 'O'

                elif board[r][c] == 'O':
                    board[r][c] = 'X'


# =========================
# 실행 예시
# =========================
if __name__ == "__main__":

    board = [
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'O', 'X'],
        ['X', 'X', 'O', 'X'],
        ['X', 'O', 'X', 'X']
    ]

    print("=== 입력 보드 ===")
    print_board(board)

    # 실행 방식 선택
    Solution().solve(board)
    #SolutionNested().solve(board)
    # SolutionDFSStack().solve(board)
    #SolutionBFS().solve(board)

    print("\n=== 처리 후 보드 ===")
    print_board(board)