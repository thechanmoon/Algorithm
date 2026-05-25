135. Candy
Hard
Topics
premium lock icon
Companies
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 

Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104 

난이도: Hard
주제
프리미엄 잠금 아이콘
회사

n명의 아이들이 줄지어 서 있습니다. 각 아이는 정수 배열 ratings에 주어진 등급 값을 부여받습니다.

사탕을 다음 요구 사항을 만족하도록 배분합니다:

- 각 아이는 적어도 하나의 사탕을 가져야 합니다.
- 더 높은 등급을 가진 아이는 이웃보다 더 많은 사탕을 받아야 합니다.

아이들에게 사탕을 나누기 위해 필요한 최소 사탕 개수를 반환하세요.

예제 1:

입력: ratings = [1,0,2]
출력: 5
설명: 첫 번째, 두 번째, 세 번째 아이에게 각각 2, 1, 2개의 사탕을 배분할 수 있습니다.

예제 2:

입력: ratings = [1,2,2]
출력: 4
설명: 첫 번째, 두 번째, 세 번째 아이에게 각각 1, 2, 1개의 사탕을 배분할 수 있습니다.
세 번째 아이는 위 두 조건을 만족하므로 1개의 사탕을 받습니다.

제약 조건:

- n == ratings.length
- 1 <= n <= 2 * 10^4
- 0 <= ratings[i] <= 2 * 10^4
