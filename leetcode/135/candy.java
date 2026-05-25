import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int total = candies[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            total += candies[i];
        }

        return total;
    }
}

class Solution1 {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int up = 0;
        int down = 0;
        int peak = 0;

        int candies = 1;

        for (int i = 1; i < n; i++) {

            // 증가
            if (ratings[i] > ratings[i - 1]) {
                up++;
                peak = up;
                down = 0;

                candies += up + 1;
            }

            // 같은 경우
            else if (ratings[i] == ratings[i - 1]) {
                up = 0;
                down = 0;
                peak = 0;

                candies += 1;
            }

            // 감소
            else {
                up = 0;
                down++;

                candies += down + 1;

                // peak 중복 보정
                if (peak >= down) {
                    candies -= 1;
                }
            }
        }
        return candies;
    }
}

class Candy {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        Solution solution = new Solution();
        int result = solution.candy(ratings);

        System.out.println("Solution - Input ratings: " + Arrays.toString(ratings));
        System.out.println("Minimum candies needed: " + result);

        Solution1 solution1 = new Solution1();
        result = solution1.candy(ratings);

        System.out.println("Solution1 - Input ratings: " + Arrays.toString(ratings));
        System.out.println("Minimum candies needed: " + result);
    }
}
