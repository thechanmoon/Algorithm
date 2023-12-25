# class Solution(object):
#     def titleToNumber(self, columnTitle):
#         """
#         :type columnTitle: str
#         :rtype: int
#         """
#         num = 0
#         sum = 0
#         for c in columnTitle:
#             num = ord(c) - ord('A') + 1
#             sum = sum*26 + num
#         return sum

class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        num = 0
        sum = 0
        for c in columnTitle:
            num = ord(c) - ord('A') + 1
            sum = sum*26+num
        return sum


sl = Solution()
print(sl.titleToNumber("A"))
print(sl.titleToNumber("AB"))
print(sl.titleToNumber("ZY"))
