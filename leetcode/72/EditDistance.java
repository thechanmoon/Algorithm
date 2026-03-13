class EditDistance{
        public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.minDistance("horse","ros"));
        System.out.println(sl.minDistance("intention","execution"));
    }
}
class Solution {

    // word1을 word2로 변환하는 최소 연산 횟수를 계산하는 함수
    public int minDistance(String word1, String word2) {

        // word1의 길이 저장
        int m = word1.length();

        // word2의 길이 저장
        int n = word2.length();

        // DP 테이블 생성
        // dp[i][j] = word1의 앞 i개 문자 -> word2의 앞 j개 문자로 바꾸는 최소 연산 수
        int[][] dp = new int[m + 1][n + 1];

        // word2가 빈 문자열일 때
        // word1의 모든 문자를 delete 해야 함
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;   // i번 삭제
        }

        // word1이 빈 문자열일 때
        // word2의 문자들을 insert 해야 함
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;   // j번 삽입
        }

        // word1의 문자 하나씩 탐색
        for (int i = 1; i <= m; i++) {

            // word2의 문자 하나씩 탐색
            for (int j = 1; j <= n; j++) {

                // 현재 비교하는 문자
                // word1[i-1] 과 word2[j-1]
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {

                    // 문자가 같으면 아무 연산 필요 없음
                    // 이전 상태 그대로 가져옴
                    dp[i][j] = dp[i - 1][j - 1];

                } else {

                    // insert 연산
                    // word2에 문자 하나 추가
                    int insert = dp[i][j - 1] + 1;

                    // delete 연산
                    // word1의 문자 하나 삭제
                    int delete = dp[i - 1][j] + 1;

                    // replace 연산
                    // word1 문자를 word2 문자로 교체
                    int replace = dp[i - 1][j - 1] + 1;

                    // 세 연산 중 최소값 선택
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }

        // 최종 결과
        // word1 전체 -> word2 전체 변환 최소 연산 수
        return dp[m][n];
    }
}