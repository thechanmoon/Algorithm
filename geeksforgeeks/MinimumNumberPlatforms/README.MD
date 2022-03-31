https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

Minimum Number of Platforms Required for a Railway/Bus Station

Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays that represent the arrival and departure times of trains that stop.

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.

Output
Minimum Number of Platforms Required = 3
Complexity Analysis:

Time Complexity: O(N _ log N).
One traversal O(n) of both the array is needed after sorting O(N _ log N), so the time complexity is O(N \* log N).
Space Complexity: O(1).
As no extra space is required.
Note: The solution mentioned above uses O(n log n) time complexity and O(1) Space Complexity. There is one more approach to the problem, which uses O(n) extra space and O(n) time to solve the problem:
Minimum Number of Platforms Required for a Railway/Bus Station | Set 2 (Map-based approach)
This article is contributed by Shivam. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above
