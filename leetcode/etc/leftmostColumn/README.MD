In a binary matrix (all elements are 0 and 1), every row is sorted in ascending order (0 to the left of 1). Find the leftmost column index with a 1 in it.

Example 1:

Input:
[[0, 0, 0, 1],
 [0, 0, 1, 1],
 [0, 1, 1, 1],
 [0, 0, 0, 0]]
Output: 1
Example 2:

Input:
[[0, 0, 0, 0],
 [0, 0, 0, 0],
 [0, 0, 0, 0],
 [0, 0, 0, 0]]
Output: -1
Expected solution better than O(r * c).