class Solution(object):
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        revertedNum = 0

        while x > revertedNum:
            revertedNum = revertedNum * 10 + x % 10
            x //= 10
        
        return x == revertedNum or x == revertedNum /10 


print(Solution().isPalindrome(101));
print(Solution().isPalindrome(10));